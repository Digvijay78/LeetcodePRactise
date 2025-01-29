class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // int size = m-n;
        int[] temp = new int[nums1.length - nums2.length ];

        for(int i =0; i< nums1.length - nums2.length ; i++){

            // if(nums1[i] ==0 && i !=0 ) break;
            temp[i] = nums1[i];
        }

        int i =0;
        int j =0;
        int k =0;

        while( i<temp.length && j < nums2.length ){

            if(temp[i] <= nums2[j] ){
               nums1[k] = temp[i];
               i++;
               k++;
            } else {
                nums1[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i < temp.length){
            nums1[k] = temp[i];
               i++;
               k++;
        }

        while(j < nums2.length){
             nums1[k] = nums2[j];
                j++;
                k++;
        }
    }
}