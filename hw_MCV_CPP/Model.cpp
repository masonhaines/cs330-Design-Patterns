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
            taskList.push_back(newTask);
        }

        string getNewestTask()
        {
            return taskList.back();
        }

        list<string> getTaskList()
        {
            return taskList;
        }

        bool TaskListEmpty(){
            if(taskList.empty()){
                return true;
            }

            return false;
        }

        void ReadFile_InitTaskList(list<string> taskList){
            string tempTask;

            ifstream inFile(filename);
            if (!inFile) {
                cerr << "Error opening file up file for to do list init" << endl;
            }

            while(getline(inFile, tempTask))
            {
                taskList.push_back(tempTask);
                cout << "oi!" << taskList.back() << endl;
            }

            inFile.close();
        }

        void WriteFile_FromTaskList(list<string> taskList)
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
    };
};