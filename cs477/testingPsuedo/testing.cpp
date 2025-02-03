#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// Function to schedule jobs and calculate the minimum weighted sum of finishing times
int scheduleJobs(vector<vector<int>>& jobs) {
    int n = jobs.size();
    
    // Step 1: Calculate the ratio t_i / w_i for each job
    vector<pair<double, int>> ratios(n);
    for (int i = 0; i < n; ++i) {
        double ratio = (double)jobs[i][0] / jobs[i][1];
        ratios[i] = {ratio, i};
    }

    // Step 2: Sort jobs by the ratio t_i / w_i in non-decreasing order
    sort(ratios.begin(), ratios.end());

    // Step 3: Calculate the finishing times and the weighted sum
    int current_time = 0;
    int total_weighted_sum = 0;
    for (int i = 0; i < n; ++i) {
        int job_index = ratios[i].second;
        current_time += jobs[job_index][0]; // Add the processing time
        total_weighted_sum += jobs[job_index][1] * current_time; // Weighted finishing time
    }

    return total_weighted_sum;
}

int main() {
    // Example input: list of jobs with their processing times and weights
    vector<vector<int>> jobs = {
        {2, 5},  // {processing_time, weight}
        {4, 1}
    };

    // Calculate the minimum weighted sum of finishing times
    int minimum_weighted_sum = scheduleJobs(jobs);

    // Output the minimum weighted sum
    cout << "Minimum Weighted Sum of Finishing Times: " << minimum_weighted_sum << endl;

    return 0;
}
