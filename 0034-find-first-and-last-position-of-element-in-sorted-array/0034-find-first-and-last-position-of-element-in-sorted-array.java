class Solution {

     public static int lastNumber(int[]nums, int target){

        int s = 0; 
        int e = nums.length-1;
        int ans = -1;

        while(s<=e){

            int mid = s + (e-s)/2;
            
            if(nums[mid] == target ){
                ans = mid;
                s = mid +1;
            }

           else if(nums[mid] < target){
                s = mid +1;
            } else {
                e = mid -1;
            }


        }
        return ans;
    }



    public static int firstNumber(int[]nums, int target){

        int s = 0; 
        int e = nums.length-1;
        int ans = -1;

        while(s<=e){

            int mid = s + (e-s)/2;
            
            if(nums[mid] == target ){
                ans = mid;
                e = mid -1;
            }

            if(nums[mid] < target){
                s = mid +1;
            } else {
                e = mid -1;
            }


        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        

        int[] ans = new int[2];

        int first = firstNumber(nums, target);
        int last = lastNumber(nums, target);

        ans[0] = first;
        ans[1] = last;

        return ans;
    }
}