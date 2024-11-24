#include <iostream>
#include "View.cpp"
#include "Model.cpp"
using namespace std;

namespace Control{ // Everything that is logic related 
    class TDLControl
    {
    private:
        // Given namespace for organization purposes
        View::TDLView* newTaskView; 
        Model::TDLModel* newTaskModel;

    public:
        

        TDLControl(View::TDLView* NewTaskView, Model::TDLModel* newTaskModel)
        {
            this->newTaskView = NewTaskView;
            this->newTaskModel = newTaskModel;
            
            // TDL_Logic();
        }

        void MainController()
        { 
            int userChoice = -1;
            while(userChoice != 0)
            {
                newTaskView->DisplayOptions(); 

                userChoice = newTaskView->getUserInt();
                cin.ignore(); // used to clear buffer

                if(userChoice == 1) { Controller_AddNewTask(); } // Add new task 
                else if (userChoice == 2) {Controller_DisplayToDoList();} // Display the entire to do list 
            }
        }

        void Controller_AddNewTask()
        {
            
            string tempNewTask = newTaskView->getUserTask(); // initialize new task to be passed by reference '

            newTaskModel->setNewTask(tempNewTask); // set new task to user input new task 
            newTaskView->displayNewlyAddedtask(newTaskModel->getNewestTask());
            
        }    

        void Controller_DisplayToDoList()
        {
            if(newTaskModel->TaskListEmpty())
            {
                cout << "not finished with this part yet :<>\n\n";
            }
            else 
            {
                newTaskView->displayToDoList(newTaskModel->getTaskList());
            }
            


            
        }
    };
};