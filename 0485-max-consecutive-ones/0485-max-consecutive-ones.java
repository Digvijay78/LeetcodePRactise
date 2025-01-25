class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         

         int count =0;
         int maxi =0;

         for(int i =0; i<nums.length; i++){

            if(nums[i] == 0){
                maxi = Math.max(count,maxi);
                
                count =0;
                continue;
            }

            count++;
         }
  
         maxi =  Math.max(maxi,count);
         return maxi;
    }
}