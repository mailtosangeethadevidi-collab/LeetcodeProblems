class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
   
      int minSum=Integer.MAX_VALUE;
    
       while(l<=r){
        int left=0;
        int right=0;
        int currSum=0;
        while(right<nums.size()){

            currSum+=nums.get(right);
            if(right-left+1==l){
              if(currSum>0){
                minSum=Math.min(currSum,minSum);
              }
              currSum-=nums.get(left);
                left++;
            }
            right++;

        }
        l++;
       }
       return minSum==Integer.MAX_VALUE ? -1 :minSum;
    }
}