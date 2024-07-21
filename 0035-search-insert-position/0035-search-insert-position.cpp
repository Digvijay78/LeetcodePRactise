class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {

        int s = 0;
        int e = nums.size() -1;
        int mid =0;
        int ans = -1;
        

        while(s<=e){
            mid = s + (e-s)/2;

            if(nums[mid] == target ){
                ans = mid;
                return ans;
            } else if( nums[mid] < target ) {
                ans = mid + 1;
                s = mid + 1;
                
            } else {
                e = mid-1;
                
            }
        }

        if(ans == -1) {
            return 0;
        }

        return ans;
        
    }
};