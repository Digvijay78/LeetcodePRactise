class Solution {

     public void adjustZeros(int[] nums){
        
        int count =0;
       for(int i=0; i<nums.length ; i++){

        if(nums[i] != 0){
           
           int temp = nums[i];
          nums[i] = 0;
          nums[count] = temp;
          count++;
       }
       }
      
     }

    public void moveZeroes(int[] nums) {
        
        
        adjustZeros(nums);
    }
}