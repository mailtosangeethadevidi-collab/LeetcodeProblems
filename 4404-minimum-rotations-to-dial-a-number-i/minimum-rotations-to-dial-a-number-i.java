class Solution {
    public int minRotations(String s) {
      
        int prev=0;
        int ans=0;
        for(char ch : s.toCharArray()){
            int curr=ch-'0';
            int dist=Math.abs(curr-prev);
            ans+=Math.min(dist,10-dist);
            prev=curr;

        }
        return ans;
        
    }
}