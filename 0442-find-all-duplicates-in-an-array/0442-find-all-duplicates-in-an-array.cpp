class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {

           vector<int> temp;
           unordered_map<int,int> mpp;


           for(auto x:nums){
           mpp[x]++;   
           }      

           for(auto x:mpp){

            if(x.second ==2){
                temp.push_back(x.first);
            }
           }

           return temp;
    }
};