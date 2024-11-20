#include <iostream>
#include <algorithm>
#include <fstream>
#include <iomanip> 
using namespace std;

int main() {
    int n = 4; // Number of days
    int pages[] = {0, 100, 10, 70, 70}; // pi array, number of pages on each day
    int efficiency[] = {0, 80, 40, 20, 10}; // mi array, efficiency on each day given days since last rest

    // Initialize the subproblem array
    // Initialize the arrays
    int subproblem[5][5]; 
    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= n; j++) {
            subproblem[i][j] = {-1};
        }
    }

    int maxValue = 0;
    // Iterate over each day
    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= n; j++) {
            if (j <= i) // efficiency cannot be larger than day or all of table will be populated/calculated and will not be tabulation
            {
                if (i == 0) { // base case
                    subproblem[i][j] = 0;
                } else if (j == 0) { // For zero efficiency days
                    subproblem[i][j] = maxValue;
                } else { 
                    subproblem[i][j] = min(pages[i], efficiency[j]) + subproblem[i - 1][j - 1];
                }
                maxValue = max(maxValue, subproblem[i][j]); // find new maximum value of day 
            }
        }
    }

    // // for testing
    // cout << "Subproblem Array" << endl;
    // for (int i = 0; i <= n; i++) {
    //     for (int j = 0; j <= n; j++) {
    //         cout << setw(5) << subproblem[i][j]; // Use setw for aligned output
    //     }
    //     cout << endl;
    // }

    string filename = "pages_pb_out.txt";
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
    outFile << setw(10) <<"Optimal value for the entire problem: " << maxValue << endl;
    outFile.close();

    cout << "Results written to " << filename << endl;

    return 0;
}