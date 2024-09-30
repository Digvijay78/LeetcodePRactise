class Solution {
public:
    int missingNumber(vector<int>& nums) {
        
        int n = nums.size();

        int nSum = n*(n+1);
        nSum = nSum/2;

        int aSum = 0;

        for(int i =0; i< n ; i++){

            aSum += nums[i];
        }

        int ans = nSum - aSum;

        return ans;
    }
};