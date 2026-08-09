class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max=0;
      int left=0;
      int right=0;
      int n=nums.length;
      while(right<n&&left<n){
            while(left<n && (nums[left]%2!=0 ||nums[left]>threshold) ){
               
                left++;
            }
        
            if(left<n){
            right=left+1;
            while(right<n &&nums[right]%2!=nums[right-1]%2 && nums[right]<=threshold){
                right++;
            }
            max=Math.max(max,right-left);
            left=right;
            }
        
      }
      return max;
    }
}