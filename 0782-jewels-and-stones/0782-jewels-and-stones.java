class Solution {

    // public boolean checkedStones(String  )

    public int stoneThatAreJewels(String jewels, String stones){

        int count =0;

        for(int i =0; i<stones.length(); i++){
            char checkStones = stones.charAt(i);

            String stringStoneChar = Character.toString(checkStones);

            // System.out.println(checkStones);

            if(jewels.contains(stringStoneChar)) count++;

            // checkedStone(jewels, stones);
        }

        return count;
    } 

    public int numJewelsInStones(String jewels, String stones) {
        
        int ans = stoneThatAreJewels(jewels, stones);

        return ans;
    }
}