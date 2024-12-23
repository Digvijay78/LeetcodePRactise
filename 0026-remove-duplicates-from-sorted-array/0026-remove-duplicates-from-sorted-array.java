class Solution {

    public int getUniqueElement(int[] nums){

        int count =1;
        int checkedVariable = nums[0];

          for(int i=1; i<nums.length; i++){

            if(nums[i] != checkedVariable){
                nums[count] = nums[i];
                count++;
                checkedVariable = nums[i];
            }
          }

          return count;
    }

    public int removeDuplicates(int[] nums) {
        

        int uniqueElement = getUniqueElement(nums);

        return uniqueElement;
    }
}