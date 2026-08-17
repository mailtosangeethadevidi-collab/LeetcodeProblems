class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0;
        int r=0;
        int maxlen=0;
       
        int len=s.length();
        int cost=0;
        while(r<len){
            char srr=s.charAt(r);
            char trr=t.charAt(r);
            if(srr!=trr){
                cost+=Math.abs(srr-trr);
            }
            while(l<len && cost>maxCost){
                cost-=Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
        
    }
}