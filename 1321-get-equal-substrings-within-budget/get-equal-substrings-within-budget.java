class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0;
        int r=0;
        int maxlen=0;
        int len=s.length();
        int cost[]=new int[len];

        for(int i=0;i<len;i++){
            cost[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
    
       int c=0;
        while(r<len){
            c+=cost[r];
            
            while(l<len && c>maxCost){
               c-=cost[l];
                l++;
            }
            
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
        
    }
}