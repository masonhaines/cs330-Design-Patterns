#include <iomanip>
#include <iostream>
#include <iterator>
#include <string>
#include <iomanip> 
#include <list>
using namespace std;

namespace View
{ // Everything that is UI related 
    class TDLView
    {
    public:

        string inputTask;
        int inputInt;
        char inputChar;

        void DisplayOptions()
        {
            cout << "Welcome to your To Do List\n\n";
    
            // give options for stuff to do in application
            cout << "1. Add to my list\n";
            cout << "2. Show to do list\n";
            cout << "3. Remove task from my list\n";
            cout << "0. Exit to do list\n\n";

            cout << "Please enter the option value: ";
        }

        void displayNewlyAddedtask(string newTask)
        {
            newTask = CheckIfEmptyTask(newTask);
            cout << "\nNew Task added to your list: " << newTask << "\n\n";
        }

        void displayRemovePrompt(list<string> toDoList)
        {
            cout << "\n\nWhat task have you completed?\n";
            displayToDoList(toDoList);
            cout << "Task number: ";
        }

        bool verifyTaskRemoval(list<string> toDoList, int removeChoice)
        {
            auto iterator = toDoList.begin();
            advance(iterator, removeChoice);
            cout << "Are you sure you would like to complete this task?\n " << removeChoice + 1 << ". " << *iterator << endl;
            cout << "\nWe will remove it forever!\n";
            cout << "Y/N: ";
            char finish = getUserChar();
            if (finish == 'y' || finish == 'Y')
            {
                cout << "\nCongrats on completing a task! :)\n\n";
                return true;
            }
            else if (finish == 'n' || finish == 'N')
            {
                cout << "\nGood idea, we will keep that on the list for you reference later :)\n\n";
                return false;
            }
            else 
            {
                cout << "Everyone makes mistakes, lets try this again.\n\n";
                return false;
            }

            cout << "\nError on verification of task removal\n\n";
            return false;
        }

        void displayToDoList(list<string> toDoList)
        {
            displayUnfinishedTasks(toDoList);
        
            cout << std::setw(10) << ' ' << "Your to do list";
            cout << "\n***********************************\n";
            cout << endl;

            int numTask = 1;
            for(auto iterator = toDoList.begin(); iterator != toDoList.end(); iterator++){
                cout << std::setw(5) << numTask << ". " << *iterator;
                cout << endl;
                numTask++;
            }

            cout << "\n\n";
        }

        void displayUnfinishedTasks(list<string> toDoList)
        {
            if(toDoList.size()){
                cout << "\nYou currently have " << toDoList.size() << " task(s) in your to do list.\n\n";
            } else
            {
                cout << "\nNo tasks to count! You have added " << toDoList.size() << " tasks to your to do list.\n\n";
            }
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

        char getUserChar()
        {
            cin >> inputChar;
            
            if (!(inputChar == 'Y' || inputChar == 'y' || inputChar == 'N' || inputChar == 'n'))
            {
                // cout << "This is the yes or no the user chose: " << inputChar << endl; // THIS FOR TESTING
                cout << "\nWe didn't understand your input, so we will assume that was a no?\n";
            }

            return inputChar;
        }

        int getUserInt()
        {
            
            cin >> inputInt;
            return inputInt;
        }
    };
};