class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0;
        int r=0;
        int maxlen=0;
        char srr[]=s.toCharArray();
        char trr[]=t.toCharArray();
        int len=srr.length;
        int cost=0;
        while(r<len){
            if(srr[r]!=trr[r]){
                cost+=Math.abs(srr[r]-trr[r]);
            }
            while(l<len && cost>maxCost){
                cost-=Math.abs(srr[l]-trr[l]);
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
        
    }
}