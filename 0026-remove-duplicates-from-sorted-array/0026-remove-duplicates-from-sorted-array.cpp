class Solution {
public:
    int removeDuplicates(vector<int>& arr) {

      if (arr.size() == 0){

      return 0;
      }
      else if(arr.size() == 1){

      return 1;
      }
      else{

       int v = arr[0];
       int count = 0;

       for(int i =0; i<arr.size() ; i++){
        if(arr[i] != v){
            v = arr[i];
            count = count +1;
            arr[count] = arr[i];
        }
       }

       return count+1;

      }

    }  
};