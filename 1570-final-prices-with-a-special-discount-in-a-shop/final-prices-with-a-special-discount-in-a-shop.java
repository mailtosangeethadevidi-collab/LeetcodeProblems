class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[]=new int[prices.length];
        int index=0;
        for(int i=0;i<prices.length;i++){
            int price=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    price-=prices[j];
                    break;
                }
            }
          ans[index++]=price; 
        }
        return ans;
    }
    
}