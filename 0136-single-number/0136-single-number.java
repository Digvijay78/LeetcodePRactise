class Solution {
    public int singleNumber(int[] nums) {
        
      HashMap<Integer, Integer> mpp = new HashMap<>();

      for(int i : nums){
        mpp.put(i, mpp.getOrDefault(i,0)+1);
      }

      int number = -1;

      for(int key : mpp.keySet()){
        if(mpp.get(key) ==1){
            number = key;
            break;
        }
      }

      return number;
    }
}