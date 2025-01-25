class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;

        int totalSum = n*(n+1)/2;

        int arraySum =0;

        for(int i : nums){
            arraySum += i;
        } 

        return totalSum - arraySum;
    }
}