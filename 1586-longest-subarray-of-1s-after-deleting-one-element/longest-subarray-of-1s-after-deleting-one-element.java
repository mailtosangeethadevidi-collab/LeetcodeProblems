class Solution {
    public int longestSubarray(int[] nums) {
       int l=0;
       int r=0;
       int maxOnes=0;
       int del=0;
        int onesCount=0;
       int len=nums.length;
       int flag=0;
       while(r<len){
        if(nums[r]==0){
            flag=1;
            del++;
        }
        if(nums[r]==1){
            onesCount++;
        }
        while(del>1){
            if(nums[l]==0){
                del--;
            }
            if(nums[l]==1){
                onesCount--;
            }
            l++;
        }
        maxOnes=Math.max(maxOnes,onesCount);
       r++;
       }
       if(flag==0){
        return len-1;
       }
       return maxOnes;
    }
}