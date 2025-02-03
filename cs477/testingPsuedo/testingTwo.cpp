#include <iostream>
#include <algorithm>
using namespace std;

// Structure to represent an event
struct Event {
    int time;   // Start or end time of an interval
    bool isStart; // true if start, false if end
    int index;  // Index of the interval
};

// Comparator for sorting events
bool compareEvents(const Event &a, const Event &b) {
    if (a.time != b.time) 
        return a.time < b.time;
    return a.isStart < b.isStart; // End events come before start events if times are the same
}

// Function to find the minimum leader's team
int findLeaders(int intervals[][2], int n) {
    // Step 1: Create events for all intervals
    Event events[2 * n];
    for (int i = 0; i < n; ++i) {
        events[2 * i] = {intervals[i][0], true, i};   // Start event
        events[2 * i + 1] = {intervals[i][1], false, i}; // End event
    }

    // Step 2: Sort events by time
    sort(events, events + 2 * n, compareEvents);

    // Step 3: Sweep through events
    int activeIntervals = 0;  // Number of active intervals
    int lastLeaderTime = -1;  // Last leader's time
    int leaderCount = 0;      // Count of leaders selected

    for (int i = 0; i < 2 * n; ++i) {
        if (events[i].isStart) {
            // Increment active intervals on a start event
            activeIntervals++;
        } else {
            // Process end event
            if (activeIntervals > 0) {
                // Select a leader for the current ending interval
                leaderCount++;
                lastLeaderTime = events[i].time;
                activeIntervals = 0; // Reset active intervals as they are now covered
            }
        }
    }

    return leaderCount;
}

int main() {
    // Example input
    int intervals[][2] = {
        {16, 20}, // Student 1: 4pm-8pm
        {14, 18}, // Student 2: 2pm-6pm
        {19, 21}, 
        {20,22}  // Student 3: 7pm-9pm
    };
    int n = sizeof(intervals) / sizeof(intervals[0]);

    // Find the optimal leader's team
    int leaders = findLeaders(intervals, n);

    // Output the result
    cout << "Minimum number of leaders: " << leaders << endl;

    return 0;
}
