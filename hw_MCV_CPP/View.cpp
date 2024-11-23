#include <iomanip>
#include <iostream>
#include <string>
#include <list>
using namespace std;

namespace View{ // Everything that is UI related 
    class TDLView
    {
    public:

        string inputTask;
        int inputInt;


        void DisplayOptions()
        {
            cout << "Welcome to your To Do List\n\n";
    
            // give options for stuff to do
            //option 1
            cout << "1. Add to my list\n";
            cout << "2. Show to do list\n";
            cout << "0. Exit to do list\n\n";

            cout << "Please enter the option value: ";
        }

        void displayNewlyAddedtask(string newTask)
        {
            newTask = CheckIfEmptyTask(newTask);
            cout << "\nNew Task added to your list: " << newTask << "\n\n";
        }

        void displayToDoList(list<string> toDoList)
        {
            cout << setw(10) << "-------Your to do list-------\n";
            cout << "you currently have " << toDoList.size() << "Tasks in your to do list.\n";
            for(auto iterator = toDoList.begin(); iterator != toDoList.end(); iterator++){
                cout << ' ' << *iterator;
                cout << endl;
            }

            cout << "\n\n";
        }

        string CheckIfEmptyTask(string newTask)
        {
            if(newTask.empty()){
                cout << "You entered an unnamed task, name defaulted to Unnamed Task\n";
                newTask = "Unnamed Task";
            }

            return newTask;
        }

        string getUserTask()
        {
            cout << "My new task is.... ";

            getline(cin, inputTask);
            return inputTask;
        }

        int getUserInt()
        {
            cin >> inputInt;
            return inputInt;
        }
    };
};