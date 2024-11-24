#include <iostream>
#include <string>
#include <list>
using namespace std;

namespace Model{ // Everything that is data related 
    class TDLModel
    {
    private:

        list<string> taskList;
    
    public:
            
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

        void ReadFile_InitTaskList(){
            
        }
    };
};