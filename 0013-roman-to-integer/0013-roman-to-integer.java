class Solution {
    public int romanToInt(String s) {
        	HashMap<Character, Integer> mpp = new HashMap<>();
		
		mpp.put('M', 1000);
		mpp.put('D', 500);
		mpp.put('C', 100);
		mpp.put('L', 50);
		mpp.put('X', 10);
		mpp.put('V', 5);
		mpp.put('I', 1);
		
		
		
		
		int ans = 0;
		for(int i =0; i< s.length() ; i++ ){
		    
		    int curentValue = mpp.get(s.charAt(i));
		    
		    if(i < s.length() -1 && curentValue < mpp.get(s.charAt(i+1))){
		          
		          ans -= curentValue;
		    } else {
		        ans += curentValue;
		    }
		    
		    
		}
		
		return ans;
    }
}