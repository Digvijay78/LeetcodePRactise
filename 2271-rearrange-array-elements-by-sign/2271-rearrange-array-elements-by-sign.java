class Solution {
    public int[] rearrangeArray(int[] nums) {
         
         List<Integer> positive = new ArrayList<>();
         List<Integer> negative = new ArrayList<>();

         for(int i =0; i<nums.length ; i++){

            if(nums[i] >=0  ) positive.add(nums[i]);
            else negative.add(nums[i]);
         }
             
             int pCount =0;
             int nCount = 0;
        for(int i =0; i<nums.length ; i++){

           if(i %2 ==0){
            nums[i] = positive.get(pCount);
            pCount++;
           } else {
            nums[i] = negative.get(nCount);
            nCount++;
           } 
         }

         return nums;

    }
}