class Solution {
    public int arrangeCoins(int n) {
        int i=0;
        for(i=0;i<=n&&n>=0;i++){
            n-=i;
            
        }
        return i-1;
    }
}