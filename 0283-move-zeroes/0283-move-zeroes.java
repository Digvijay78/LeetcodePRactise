class Solution {
    public void moveZeroes(int[] nums) {
         
     List<Integer> tempList = new ArrayList<>();

     for(int i:nums){

        if(i != 0){
            tempList.add(i);
        }
     }

     for(int i =0; i<nums.length; i++){

         if(i < tempList.size()){
            nums[i] = tempList.get(i);
            continue;
         }

         nums[i] = 0;
     }
         
    }
}