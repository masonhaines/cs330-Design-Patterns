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