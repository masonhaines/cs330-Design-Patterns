#include <iostream>
#include "Control.cpp"


using namespace std;

int main()
{
    View::TDLView newTaskView;
    Model::TDLModel newTaskModel;
    Control::TDLControl newTaskController(&newTaskView, &newTaskModel);

    newTaskController.MainController();




    return 0;
};





// namespace View{ // Everything that is UI related 
//     class TDLView
//     {
//     public:

//         string userInput;

//         void promptUser(string prompt)
//         {
//             cout << prompt << endl;
//         }

//         void Displaytask(string newTask)
//         {
//             cout << "New chosen task: " << newTask << endl;
//         }

//         string getUserInput()
//         {
//             getline(cin, userInput);
//             return userInput;
//         }
//     };
// };

// #include <iostream>
// using namespace std;

// namespace Model{ // Everything that is data related 
//     class TDLModel
//     {
//     private:

//         string task;
    
//     public:
            
//         void setTask(string newTask)
//         {
//             this->task = newTask;
//         }

//         string gettask()
//         {
//             return task;
//         }

            
//     };
// };

// namespace Control{ // Everything that is logic related 
//     class TDLControl
//     {
//     private:
//         // Given namespace for organization purposes
//         View::TDLView* newTaskView; 
//         Model::TDLModel* newTaskModel;

//     public:
        

//         TDLControl(View::TDLView* NewTaskView, Model::TDLModel* newTaskModel)
//         {
//             this->newTaskView = NewTaskView;
//             this->newTaskModel = newTaskModel;
            
//             // TDL_Logic();
//         }

//         void TDL_Logic()
//         {
//             // Ask the user for a new task and get new task  UI new task view object 
//             newTaskView->promptUser("please provide a new task");
//             string newSetTask = newTaskView->getUserInput();
//             // Store new task inside of new task model object
//             newTaskModel->setTask(newSetTask);
//             // get number task from new task model object
//             string newTask = newTaskModel->gettask();
//             // Display new task to user with UI new task view object 
//             newTaskView->Displaytask(newTask);
//        }
//     };
// };

// int main()
// {
//     View::TDLView newTaskView;
//     Model::TDLModel newTaskModel;
//     Control::TDLControl newTaskController(&newTaskView, &newTaskModel);

//     newTaskController.TDL_Logic();








//     return 0;
// };
