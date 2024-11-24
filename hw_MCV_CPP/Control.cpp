#include <iostream>
// Control should be the only class that has composition with the other classes
#include "View.cpp"
#include "Model.cpp"
using namespace std;

namespace Control
{ // Everything that is logic related 
    class TDLControl
    {
    private:
        // Given namespace for organization purposes
        View::TDLView* newTaskView; 
        Model::TDLModel* newTaskModel;

    public:

        // Constructor to initialize model and view objects
        TDLControl(View::TDLView* NewTaskView, Model::TDLModel* newTaskModel)
        {
            this->newTaskView = NewTaskView;
            this->newTaskModel = newTaskModel;
        }

        // This is the main controller for calling all other controller functionalities
        // this method also calls the model method that initializes the list
        // also writes the modifications to the list back to the file using model method 
        void MainController()
        { 
            list<string>& taskList = newTaskModel->getTaskList();
            newTaskModel->ReadFile_InitTaskList(taskList);

            int userChoice = -99;
            while(userChoice != -1)
            {
                // if user choice is zero write back to file and set user choice to -99 to end while loop
                if(userChoice == 0)
                {
                    newTaskModel->WriteFile_FromTaskList(taskList);
                    userChoice = -1;
                }
                else 
                {
                    newTaskView->DisplayOptions(); 

                    userChoice = newTaskView->getUserInt();
                    cin.ignore(); // used to clear buffer

                    if(userChoice == 1) { Controller_AddNewTask(); } // Add new task 
                    else if (userChoice == 2) { Controller_DisplayToDoList(); } // Display the entire to do list 
                    else if (userChoice == 3) { Controller_RemoveTask(); } // Remove specific value from to do list
                }
            }
        }

        // Controller method to add new task to the to do list<string>
        void Controller_AddNewTask()
        {
            string tempNewTask = newTaskView->getUserTask(); // initialize new task to be passed by reference '

            newTaskModel->setNewTask(tempNewTask); // set new task to user input new task 

            newTaskView->displayNewlyAddedtask(newTaskModel->getNewestTask()); // Display newly added task 
        }  

        // Controller method to remove a specific task from the to do list<string>
        void Controller_RemoveTask()
        {
            newTaskView->displayRemovePrompt(newTaskModel->getTaskList());
            int removeChoice = newTaskView->getUserInt() - 1;
            bool removeTask = newTaskView->verifyTaskRemoval(newTaskModel->getTaskList(), removeChoice);
            if (removeTask)
            {
                newTaskModel->removeFromTaskList(removeChoice);
            }
        }  
        // Controller method to display the todo list<string>
        void Controller_DisplayToDoList()
        {
            newTaskView->displayToDoList(newTaskModel->getTaskList());
        }
    };
};