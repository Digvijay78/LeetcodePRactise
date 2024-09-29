class Solution {
public:
   
   void merge(vector<int> &nums, int low, int mid, int high ){

     int left = low;
     int right = mid+1;
     
     int n = nums.size()-1;
     vector<int> temp;

     while(left <= mid && right <= high){

        if(nums[left] <= nums[right]){
            temp.push_back(nums[left]);
            left++;
        } else {
            temp.push_back(nums[right]);
            right++;
        }
     }

     while(left <= mid){
        temp.push_back(nums[left]);
        left++;
     }
     while(right <= high){
        temp.push_back(nums[right]);
        right++;
     }

     for(int i =low ;i <= high; i++){
        nums[i] = temp[i - low];
     }

   }

   void divide(vector<int> &nums , int low, int high){

      if(   low == high) return ;

      int mid = (low+high)/2;

      divide(nums, low,mid);
      divide(nums, mid+1,high);
      merge(nums, low, mid , high);

   }

    vector<int> sortArray(vector<int>& nums) {
        
        int n = nums.size()-1;
        divide(nums, 0, n);

        return nums;
    }
};