class Solution {
    public boolean isAnagram(String s, String t) {
        
        if ( s.length() != t.length()) return false;

        char cS[] = s.toCharArray();
        char cT[] = t.toCharArray();

        Arrays.sort(cS);
        Arrays.sort(cT);

        for(int i =0 ; i< cS.length ; i++){
             
             if(cS[i] != cT[i]){
                return false;
             }

        }  

        return true;
    }
}