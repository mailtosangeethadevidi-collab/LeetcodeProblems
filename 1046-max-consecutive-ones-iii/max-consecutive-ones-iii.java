class Solution {
    public int longestOnes(int[] nums, int k) {
       int left=0;
       int zeroCount=0;
       int right=0;
       int maxlen=0;
       for(right=0;right<nums.length;){
           if(nums[right]==0){
            zeroCount++;
           }
           while(zeroCount>k){
            if(nums[left]==0){
                zeroCount--;
            }
            left++;
           }
           if(zeroCount<=k){
             maxlen=Math.max(maxlen,right-left+1);
           }
           right++;
       } 
       return maxlen;
    }
}