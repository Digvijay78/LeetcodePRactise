class Solution {
public:
    int majorityElement(vector<int>& nums) {
        
        int count =0, v= 0;
       for(int x =0; x<= nums.size() -1 ; x++){

            if(count ==0) v = nums[x];
            
           if ( v == nums[x]) count++;

            else count--;

        }

        return v;

        
    }
};