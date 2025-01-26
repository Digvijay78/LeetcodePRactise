class Solution {
    public int[] plusOne(int[] arr) {

        List<Integer> ans = new ArrayList<>();
        boolean flag = true;
        int carry =1;

     for(int i=arr.length -1; i>=0 ; i--){
         if(arr[i] == 9 && carry == 1  ){
            arr[i] = 0;
            ans.add(arr[i]);
            // carry =1;
         } else {
            arr[i] += carry;
            // flag = false;
            ans.add(arr[i]);
            carry =0;
         }
        
     }   
         if(carry == 1){
            ans.add(1);
         }

      Collections.reverse(ans);

         int[] array = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            array[i] = ans.get(i); // Unbox Integer to int
        }
        return array;

    }
}