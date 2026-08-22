class Solution {
    public int balancedString(String s) {
        int len=s.length();
        int k=len/4;
        int arr[]=new int[26];
        for(char ch : s.toCharArray()){
            arr[ch-'A']++;
        }
        int min=len;
        int l=0;
        int r=0;
      
        while(r<len){
         
               arr[s.charAt(r)-'A']--; 
               while(l<len &&arr['Q'-'A']<=k && arr['E'-'A']<=k && arr['R'-'A']<=k && arr['W'-'A']<=k){
                min=Math.min(r-l+1,min);
                arr[s.charAt(l)-'A']++;
                l++;
               }      
           
           r++;
        }
        return min;
    
    }
}