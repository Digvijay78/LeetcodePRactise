class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> mpp = new HashMap<>();

        int[] ans = new int[2];

        for(int i =0; i< nums.length; i++){

            int rem = target - nums[i];

            if(mpp.containsKey(rem)){
                ans[0] = mpp.get(rem);
                ans[1] = i;
            }else {

                 mpp.put(nums[i],i);  
            }
        }

        

        return ans;
    }
}