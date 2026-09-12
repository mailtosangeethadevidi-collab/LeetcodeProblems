class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int r=0;
        int len=s.length();
        int maxcount=0;
        int count=0;
       
        while(r<len){
            char ch = s.charAt(r);
           
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
            if(r-l+1==k){
                maxcount=Math.max(maxcount,count);
                char left=s.charAt(l);
                if(left=='a' || left=='e' || left=='i' || left=='o' || left=='u'){
                count--;
                }
                l++;
            }
                
           
            r++;
        }
        return maxcount;
        
    }
   
}