#include <iostream>

using namespace std;

int FindConsecutiveAdjacentPairs(int* Array, int left, int right) 
{
    // Base case
    if (left == right) return 0;

    // Divide
    int mid = (left + right) / 2;

    // Recursive calls to find pairs on left and right of division
    FindConsecutiveAdjacentPairs(Array, left, mid);
    FindConsecutiveAdjacentPairs(Array, mid + 1, right);

    int midAdjPairs = 0; // pairs variable

    cout << "Array used for current call : [";

    for (int i = left; i <= right; i++) 
    {
        // Check if adj values(mid and mid + 1) and consecutive. Only check if mid+1 is left than right to prevent a double count 
        if(abs(Array[i] - Array[i + 1]) ==  1 && i < right) 
        {
            midAdjPairs++; // Update pairs for array input
        } 
        
        cout << Array[i];
        if (i == right) cout << "].  ";
        else cout << ", ";
        
    }
    
    cout << "Number of pairs computed for input : " << midAdjPairs << endl;

    return midAdjPairs;
}

int main()
{
    int Array[] = {1, 2, 3, 4, 6, 7, 6, 3, 4, 5, 3, 3, 4, 8, 9, 10};

    int numberOfPairs = FindConsecutiveAdjacentPairs(Array, 0, 15);

    cout << "Total number of Pairs: " << numberOfPairs << endl;

    return 0;
}