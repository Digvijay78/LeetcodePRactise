class Solution {
    public int[] twoSum(int[] nums, int target) {
        
   HashMap<Integer, Integer> store = new HashMap<>();

   int[] ans = new int[2];

   for(int i=0; i<nums.length; i++){

    store.put(nums[i], i);
   }

   for(int i=0; i< nums.length ; i++){

    int complement = target - nums[i];

    if(store.containsKey(complement) && store.get(complement) != i ){
        ans[0] = i;
        ans[1] = store.get(complement);
    }
   }

   return ans;
}
}