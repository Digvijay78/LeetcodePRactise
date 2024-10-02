class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        k = k % nums.size(); // Ensure k is within bounds

        // Create the 'first' vector containing the last 'k' elements
        vector<int> first;
        for(int i = nums.size() - k; i < nums.size(); i++) {
            first.push_back(nums[i]);
        }

        // Create the 'second' vector containing the first 'n-k' elements
        vector<int> second;
        for(int i = 0; i < nums.size() - k; i++) {
            second.push_back(nums[i]);
        }

        // Copy the rotated elements back to the original array
        for(int i = 0; i < first.size(); i++) {
            nums[i] = first[i];
        }

        for(int i = 0; i < second.size(); i++) {
            nums[i + first.size()] = second[i];
        }
    }
};
