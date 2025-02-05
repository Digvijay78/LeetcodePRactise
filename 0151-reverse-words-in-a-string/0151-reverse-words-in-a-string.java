class Solution {
    public String reverseWords(String s) {

            String[] str = s.split(" +");

            StringBuilder ans = new StringBuilder();

            for(int i = str.length -1; i>=0; i-- ){

                ans.append(str[i]);
                
                if(i > 0){
                    ans.append(" ");
                } else {
                    ans.append("");
                }
            }   

            return ans.toString().trim();
    }
}