class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int floor = Integer.MIN_VALUE;
        int fIndex = -1;

        int s =0;
        int e = nums.length -1;
        boolean flag = false;

        while(s<=e){

            int mid = s + (e-s)/2;

            if(nums[mid] == target ) return mid;

            if(nums[mid] < target ){
                if(nums[mid] >= floor ){

                flag = true;
                fIndex = Math.max(mid,fIndex);
                floor = nums[mid];
                }
                s = mid +1;
            } else {
                e = mid -1;
            }
        }
      System.out.println("FLLOR" + floor);
        return flag ? fIndex + 1 : 0;
    }
}