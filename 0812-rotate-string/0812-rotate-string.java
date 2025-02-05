class Solution {
    public boolean rotateString(String s, String goal) {

        String big = s + s; 
        
        if(s.length() != goal.length()) return false;
        
        if(big.contains(goal)){
            return true;
        } else {
            return false;
        }
           


    }
}