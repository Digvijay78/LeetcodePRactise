class Solution {
    public int subarraySum(int[] nums, int k) {

       int sum =0;
       HashMap<Integer, Integer> mpp = new HashMap<>();
       int count =0;

       mpp.put(0,1);

       for(int i =0; i< nums.length ; i++){
          
          sum += nums[i];

          int rem = sum - k;

          if(mpp.containsKey(rem)){
            count += mpp.get(rem) ;
            
          } 
          
          mpp.put(sum, mpp.getOrDefault(sum,0)+1);

    }
       return count;
    }
}