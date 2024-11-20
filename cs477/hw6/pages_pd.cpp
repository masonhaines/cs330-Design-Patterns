#include <iostream>
#include <iomanip>
#include <ostream>
#include <fstream>
using namespace std;

int main() {
    int n = 4; // Number of days
    int pages[] = {0, 100, 10, 70, 70}; // pi array, number of pages on each day
    int efficiency[] = {0, 80, 40, 20, 10}; // mi array, efficiency on each day given days since last rest

    int subproblem[5][5]; // Subproblem table
    int choicesArray[5][5]; // Choices array

    // Open the file
    ifstream infile("pages_pc_out.txt");
    if (!infile) {
        cerr << "Error opening file." << endl;
        return 1;
    }

    // Skip the header lines for Subproblem Table
    string line;
    getline(infile, line); // Skip "Subproblem Table:"
    for (int i = 0; i < 5; ++i) {
        for (int j = 0; j < 5; ++j) {
            infile >> subproblem[i][j];
        }
    }

    // Ensure the rest of the line is ignored after the Subproblem Table
    infile.ignore();

    // Skip the header lines for Choices Array
    getline(infile, line); // Skip the empty line if any
    getline(infile, line); // Skip "Choices Array (1 - 4 = Work and level of efficiency, 0=Rest):"
    for (int i = 0; i < 5; ++i) {
        for (int j = 0; j < 5; ++j) {
            infile >> choicesArray[i][j];
        }
    }

    infile.close(); // Close the file after reading

    // test print the for tables
    // cout << "Subproblem Table: " << endl;
    // for (int i = 0; i < 5; ++i) {
    //     for (int j = 0; j < 5; ++j) {
    //         cout << setw(5) << subproblem[i][j];
    //     }
    //     cout << endl;
    // }

    // cout << "Choices Array: " << endl;
    // for (int i = 0; i < 5; ++i) {
    //     for (int j = 0; j < 5; ++j) {
    //         cout << setw(5) << choicesArray[i][j];
    //     }
    //     cout << endl;
    // }

    int scheduleArray[4] = {0, 0, 0, 0};

    int maxValue = 0;
    int maxValueIndex_i = 0; // current day of streak
    int maxValueIndex_j = 0; // current work day streak
    // Iterate over each day backwards to have max value found right off the bat
    for (int i = n; i > 0; i--) {
        for (int j = n; j > 0; j--) {
            if (j <= i){
                if(i == 1){
                    scheduleArray[i-1] = 1; // this assuming first day working is after day off
                }
                else if (i == n && subproblem[i][j] > maxValue) {
                    maxValue = subproblem[i][j];
                    maxValueIndex_i = i;
                    maxValueIndex_j =j;

                    scheduleArray[n-1] = 1; // worked on nth day
                }  
                else if(i > maxValueIndex_i - maxValueIndex_j){
                    scheduleArray[i-1] = 1; // worked on ith day
                }
                else if(i == maxValueIndex_i - maxValueIndex_j){
                    scheduleArray[i-1] = 0; // day off before work streak
                }
            }
        }
    }
    
    // For testing
    // cout << "Optimal Schedule: " << endl;
    // int totalPages = 0;
    // for (int i = 0; i < n; ++i) {
    //     if (scheduleArray[i] == 1) {
    //         cout << "-Work" << endl;
    //     } else {
    //         cout << "-Day Off " << endl;
    //     }
    // }
    // cout << endl;

    string filename = "pages_pd_out.txt";
    ofstream outFile(filename);

    // edge case for not being able to open file 
    if (!outFile) {
        cerr << "Could not open " << filename << endl;
        return 1;
    }

    outFile << "Optimal Schedule: " << endl;
    int totalPages = 0;
    for (int i = 0; i < n; ++i) {
        if (scheduleArray[i] == 1) {
            outFile << "-Work" << endl;
        } else {
            outFile << "-Day Off " << endl;
        }
    }
    outFile << endl;

    return 0;
}
