class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();

        if(nums.length == 1) {
            ans.add(nums[0]);
            return ans;
        }

        if(nums.length == 2) {
            if(nums[0] != nums[1] ){

            ans.add(nums[0]);
            ans.add(nums[1]);
            } else {
                ans.add(nums[0]);
            }
            return ans;
        }

        int first = nums[0];
        int firstCount = 0;

        int second = Integer.MIN_VALUE;;
        int secondCount = 0;

        for(int i =0; i< nums.length ; i++){

           if(firstCount ==0 && nums[i] != second  ){
            first = nums[i];
            firstCount++;
           }else if(secondCount == 0 && nums[i] != first ){
            second = nums[i];
            secondCount++;
           }else if(nums[i] == first ){
            firstCount++;
           }else if(nums[i] == second ){
            secondCount++;
           } else {
            firstCount--;
            secondCount--;
           }
        }

        if(firstCount ==0 && secondCount ==0){
            return ans;
        }

       int c1 =0;
       int c2 =0;
       for(int i =0 ; i<nums.length ; i++){
          if(nums[i] == first ) c1++;

          if(nums[i] == second ) c2++;
       }

       if(c1 > nums.length/3) ans.add(first);
       if(c2>nums.length/3) ans.add(second);


       
           return ans;
    }
}