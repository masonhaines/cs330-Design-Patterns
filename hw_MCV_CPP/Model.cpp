#include <iostream>
#include <string>
#include <list>
#include <fstream>
using namespace std;

namespace Model
{ // Everything that is data related 
    class TDLModel
    {
    private:

        list<string> taskList;
        string filename;
        
    public:

        TDLModel() : filename("ToDoList.txt")  {}
        
        // Set &newtask as last value in list
        void setNewTask(string& newTask)
        {
            taskList.push_back(newTask);
        }

        // Get most recently added value in list 
        string getNewestTask()
        {
            return taskList.back();
        }

        // return task list by reference or will be copied and not manipulated 
        list<string>& getTaskList() 
        {
            return taskList;
        }

        // removes one task from to do list 
        void removeFromTaskList(int taskNumber)
        {
            auto iterator = taskList.begin(); // initialize iterator to beginning of element of list
            advance(iterator, taskNumber); // increment iterators positions 
            // cout << *iterator << " Value that was just removed\n\n\n"; // THIS IS FOR TESTING REMOVED VALUE
            taskList.erase(iterator); // erase single element at iterator index within list
        }

        // Mainly for testing and checking list through out code
        bool TaskListEmpty(){
            if(taskList.empty()){
                return true;
            }

            return false;
        }

        // reads tsks from the file and fills the given task list by reference
        void ReadFile_InitTaskList(list<string>& taskList){
            string tempTask;

            ifstream inFile(filename);
            if (!inFile) {
                cerr << "Error opening file up file for to do list init" << endl;
            }

            while(getline(inFile, tempTask))
            {
                taskList.push_back(tempTask); // sends the temp task value to the end of the list
                // cout << "TEST" << taskList.back() << endl; // For testing
            }

            inFile.close();
        }

        // Writes the given &task list back to the file with *iterator to the file
        void WriteListToFile(list<string>& taskList)
        {
            ofstream outFile(filename);
            if (!outFile){
                cerr << "Error opening file up file for to do list init" << endl;
            }
            else if(outFile.is_open())
            {
                for(auto iterator = taskList.begin(); iterator != taskList.end(); iterator++){
                    outFile << *iterator;
                    outFile << endl;
                }
                outFile.close();
            }
        }

        // Writes the given &task list back to the file with *iterator to the file
        void WriteSingleTaskToFile(list<string>& taskList)
        {
            ofstream outFile(filename, ios::app); // append new output to end of file
            if (!outFile){
                cerr << "Error opening file up file for to do list init" << endl;
            }
            else if(outFile.is_open())
            {
                auto iterator = taskList.back();
                outFile << iterator << endl;
                outFile.close();
            }
        }
    };
};