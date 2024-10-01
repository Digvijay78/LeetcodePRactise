class Solution {
public:
    int majorityElement(vector<int>& nums) {
        
        unordered_map<int,int> mpp;

        for(auto x:nums){

            mpp[x]++;
        }

        int mini = INT_MIN, ans =0;

        for(auto x:mpp){

            if(x.second > mini){
                ans = x.first;
                mini = x.second;
            }
        }

        return ans;
    }
};