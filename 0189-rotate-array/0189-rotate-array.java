class Solution {
    public void rotate(int[] nums, int k) {
        

        List<Integer> temp = new ArrayList<>();

        for(int i = nums.length-1; i>= nums.length -k%nums.length ; i--){
            temp.add(nums[i]);
        }
        
        Collections.reverse(temp);

        for(int i = 0 ; i< nums.length - k%nums.length ; i++ ){
            temp.add(nums[i]);
        }

        for(int i =0; i< temp.size(); i++){
            nums[i] = temp.get(i);
        }
    }
}