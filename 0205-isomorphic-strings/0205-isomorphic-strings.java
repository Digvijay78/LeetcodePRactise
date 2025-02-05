class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> mpp = new HashMap<>();
         HashMap<Character, Character> used = new HashMap<>();

        for(int i =0; i< s.length(); i++){
                 
                 char cs = s.charAt(i);
                 char ct = t.charAt(i);
            if(mpp.containsKey(cs)){
                if(!mpp.get(cs).equals(ct)) return false;
            } else {
                if(used.containsKey(ct)){
                    return false;
                }
                used.put(ct,cs);
                mpp.put(cs, ct);
            }
        }

        return true;
    }
}