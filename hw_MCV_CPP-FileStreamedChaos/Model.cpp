#include <iostream>
#include <string>
#include <list>
#include <fstream>
#include <iomanip> 
using namespace std;

namespace Model{ // Everything that is data related 
    class TDLModel
    {
    private:

        list<string> taskList;
        string filename;
        
    public:

        TDLModel() : filename("ToDoList.txt")  {}
            
        void setNewTask(string& newTask)
        {
            if(taskList.empty())
            {
                setNewTaskToFile(newTask);
            }
            else 
            {
                taskList.push_back(newTask);
            }
        }

        void setNewTaskToFile(string newTask)
        {
            ofstream outFile(filename, ios::app); // Append new task to end up file 
            if (!outFile) {
                cerr << "Could not open to append" << filename << endl;
            }

            cout << newTask << endl;
            outFile.close();
        }

        string getNewestTask()
        {
            if(taskList.empty())
            {
                string lastTaskFileEntry = getNewestTaskFromFile();
                return lastTaskFileEntry;
            }
            return taskList.back();
        }

        string getNewestTaskFromFile()
        {
            string currentLine;
            string newLastLine;

            ifstream inFile(filename); // open file and append
            if (!inFile) {
                cerr << "Error opening file to get most recent appended task" << endl;
            }

            while(getline(inFile, currentLine))
            {
                newLastLine = currentLine;
            }
            inFile.close();

            return newLastLine;
        }

        list<string> getTaskList()
        {
            if(taskList.empty())
            {

            }
            return taskList;
        }


        bool TaskListEmpty(){
            if(taskList.empty()){
                return true;
            }

            return false;
        }

        int ReadFile_InitTaskList(list<string> taskList){
            string tempTask;

            ifstream inFile(filename);
            if (!inFile) {
                cerr << "Error opening file." << endl;
                return -1;
            }

            while(getline(inFile, tempTask))
            {
                taskList.push_back(tempTask);
            }
            inFile.close();

            return 1;
        }
    };
};