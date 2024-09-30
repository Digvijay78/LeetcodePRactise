class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        
        int count = 0;

        int countMax = 0;

        for(int i=0; i< nums.size(); i++){

            if(nums[i] == 1){
                count ++;
            }
             else {
                countMax = max(countMax, count);
                count = 0;
             }
        }

        if( count > countMax) {
            return count;
        } else {
            return countMax;
        }
    }
};