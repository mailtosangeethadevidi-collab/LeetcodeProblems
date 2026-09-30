class Solution {
    public int longestPalindrome(String s) {
        int hash[]=new int[123];
        int diff=0;
        for(char ch :s.toCharArray()){
            if(hash[ch]==0){
                diff++;
            }
            hash[ch]++;
        }
        if(diff==1 || (diff==2 && s.length()%2!=0)) return s.length();
    
        int len=0;
        int count=0;
       
        for(int i:hash){
            if(i!=0){
                if(i%2==0){
                    
                    len+=i;
                    
                }
                else {
                   if(i>=2)
                    len+=(i-1);
                    count++;
                }
            }
        }
        if(count!=0){
            len+=1;
        }

        return len;
        
    }
}