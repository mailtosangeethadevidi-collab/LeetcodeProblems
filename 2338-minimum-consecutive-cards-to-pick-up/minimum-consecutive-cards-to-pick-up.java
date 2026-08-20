class Solution {
    public int minimumCardPickup(int[] cards) {

      boolean hash[]=new boolean[1000001];
        int l=0;
        int r=0;
        int len=cards.length;
        int min=Integer.MAX_VALUE;
        while(r<len){
            while(hash[ cards[r] ]){
                if(cards[l] == cards[r]){
                min=Math.min(min,r-l+1);
                }
               
                hash[cards[l]]=false;
                l++;
            }
            hash[cards[r]]=true;
            r++;
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}