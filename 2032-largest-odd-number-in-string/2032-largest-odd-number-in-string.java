class Solution {
    public String largestOddNumber(String num) {
         
        StringBuilder ans = new StringBuilder();
          
          int index = -1;

         for(int i = num.length() -1; i>= 0; i-- ){
            
            if((num.charAt(i) - '0') % 2 != 0){
                index = i;
                break;
            }
         }

         if(index < 0){
            return "";
         } else {
            for(int i =0; i<=index ; i++ ){
                ans.append(num.charAt(i));
            }
         }

         return ans.toString();
    }
}