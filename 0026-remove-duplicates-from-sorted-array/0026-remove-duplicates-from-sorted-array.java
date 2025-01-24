class Solution {
    public int removeDuplicates(int[] nums) {
         
         int temp = nums[0];
         int count = 1;

         for(int i =0; i< nums.length; i++){
             
             if(nums[i] != temp){
                nums[count] = nums[i];
                count++;
                temp = nums[i];
             }
         }

         return count;
    }
}