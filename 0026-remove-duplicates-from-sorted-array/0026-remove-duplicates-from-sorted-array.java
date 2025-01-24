class Solution {
    public int removeDuplicates(int[] nums) {
        
        Set<Integer> s = new HashSet<>();

        for(int i =0; i< nums.length; i++){
                s.add(nums[i]);
        }
        
        List<Integer> temp = new ArrayList<>(s);

        Collections.sort(temp);
        int count =0;

        for(int i: temp){
            nums[count] = i;
            count++;
        }

        return s.size(); 

    }
}