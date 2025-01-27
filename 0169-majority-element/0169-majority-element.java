class Solution {
    public int majorityElement(int[] nums) {
         
         int number = nums[0];

         int count =0;

         for(int i =0; i< nums.length ; i++){

             if(count == 0){
                number = nums[i];
             } 
            if(nums[i] == number ){
                count++;
            } else {
                count = count -1;
                 
            }
         }

         return number;
    }
}