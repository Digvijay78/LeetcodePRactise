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

        HashMap<Integer, Integer> mpp = new HashMap<>();
           
           for(int i =0; i< nums.length ; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
           }

           for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
              
              if(entry.getValue() > nums.length/3 ){
                ans.add(entry.getKey());
              }
           }

           return ans;
    }
}