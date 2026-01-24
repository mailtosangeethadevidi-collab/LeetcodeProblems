class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int i=0;
        int min=Integer.MAX_VALUE;
        for( i=0;i<prices.length-1;i++){
            if(prices[i]<min){
            int selling=0;
             for(int j=i+1;j<prices.length;j++){
                      if(prices[j]>selling){
                      selling=prices[j];
                      }
             }
             min=prices[i];
           profit=Math.max(profit,selling-prices[i]);
        }
    }
    if(profit>0){
        return profit;
    }
        return 0;
       
    }
}