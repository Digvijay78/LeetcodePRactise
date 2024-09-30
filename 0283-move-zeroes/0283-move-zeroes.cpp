class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        
        int nonIndex =0;

        int n = nums.size();

        for(int i =0; i< n ; i++){

            if(nums[i] != 0){

                nums[nonIndex] = nums[i];
                nonIndex++;
            }
        }

        for(int i = nonIndex ; i < n ; i++){
            nums[i] = 0;
        }


    }
};