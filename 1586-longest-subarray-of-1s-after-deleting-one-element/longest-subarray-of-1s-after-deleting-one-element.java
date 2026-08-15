class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 0;
        }

        int flag=0;
        int l=0;
        int r=0;
        int del=0;
        int count=0;
        int maxcount=0;
        while(r<n){
            if(nums[r]==0){
                flag=1;
                del++;
            }
            if(nums[r]==1){
                count++;
            }
            while(l<n&&del>1){
               if(nums[l]==0){
                 del--;
               }
               else{
                count--;
               }
              l++;
            }
            if(del<=1){
              maxcount=Math.max(count,maxcount);
            }
            r++;
        }
        if(flag==0){
            return n-1;
        }
        return maxcount;
    }
}