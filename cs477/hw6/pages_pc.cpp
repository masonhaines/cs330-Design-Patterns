#include <iostream>
#include <algorithm>
#include <fstream>
#include <iomanip> 
using namespace std;

int main() {
    int n = 4; // Number of days
    int pages[] = {0, 100, 10, 70, 70}; // pi array, number of pages on each day
    int efficiency[] = {0, 80, 40, 20, 10}; // mi array, efficiency on each day given days since last rest

    // Initialize the arrays
    int subproblem[5][5]; 
    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= n; j++) {
            subproblem[i][j] = {-1};
        }
    }

    int choicesArray[5][5];
    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= n; j++) {
            choicesArray[i][j] = {-1};
        }
    }
    

    int maxValue = 0;
    // Iterate over each day
    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= n; j++) {
            if (j <= i){
                if (i == 0) { // base case // set to zero because if on day zero no work is being done it is technically a rest day
                    choicesArray[i][j] = 0; 
                    subproblem[i][j] = 0;
                } else if (j == 0) { // For zero efficiency days
                    choicesArray[i][j] = 0; 
                    subproblem[i][j] = maxValue;
                } else { // efficiency cannot be larger than day or all of table will be populated/calculated and will not be tabulation
                    choicesArray[i][j] = 1; 
                    subproblem[i][j] = min(pages[i], efficiency[j]) + subproblem[i - 1][j - 1];
                }
                // find new maximum value of day
                if (subproblem[i][j] > maxValue) {
                    maxValue = subproblem[i][j];
                }  
            }
            
        }
    }

    ////////////////////////////////////////////////////Testing below
    // // for testing display subproblems array
    // cout << "Subproblem Array" << endl;
    // for (int i = 0; i <= n; i++) {
    //     for (int j = 0; j <= n; j++) {
    //         cout << setw(5) << subproblem[i][j]; // Use setw for aligned output
    //     }
    //     cout << endl;
    // }

    // // for testing display choices array
    // cout << "Choices Array (1=Work, 0=Rest):" << endl;
    // for (int i = 0; i <= n; i++) {
    //     for (int j = 0; j <= n; j++) {
    //         cout << setw(5) << choicesArray[i][j];
    //     }
    //     cout << endl;
    // }

    // for (int i = 0; i <= n; i++) {
    //     for (int j = 0; j <= i; j++) { // Only display relevant values
    //         cout << setw(5) << subproblem[i][j];
    //     }
    // cout << endl;
    // }

    // for (int i = 0; i <= n; i++) {
    //     for (int j = 0; j <= i; j++) { // Only display relevant values
    //         cout << setw(5) << choicesArray[i][j];
    //     }
    //     cout << endl;
    // }
    ////////////////////////////////////////////////////Testing above

    string filename = "pages_pc_out.txt";
    ofstream outFile(filename);

    // edge case for not being able to open file 
    if (!outFile) {
        cerr << "Could not open " << filename << endl;
        return 1;
    }

    // Print header for table 
    outFile << "Subproblem Table:" << endl;
    outFile << "Day" << endl;

    // Write subproblem table to the file
    for (int i = 0; i <= n; i++) {
        outFile << i << " |";
        for (int j = 0; j <= n; j++) {
            outFile << setw(5) << subproblem[i][j]; // Print calculated result of the subproblem
        }
        outFile << endl;
    }

    outFile << endl;

    // Print header for table 
    outFile << "Choices Array (1=Work, 0=Rest):" << endl;
    outFile << "Day" << endl;

    // Write choices table to the file
    for (int i = 0; i <= n; i++) {
        outFile << i << " |";
        for (int j = 0; j <= n; j++) {
            outFile << setw(5) << choicesArray[i][j]; // print choices
        }
        outFile << endl;
    }

    outFile << endl;
    outFile << setw(10) <<"Optimal value for the entire problem: " << maxValue << endl;
    outFile.close();

    cout << "Results written to " << filename << endl;

    return 0;
}