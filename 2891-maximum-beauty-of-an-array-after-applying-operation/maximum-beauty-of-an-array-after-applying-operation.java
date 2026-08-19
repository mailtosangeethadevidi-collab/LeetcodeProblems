class Solution {
    public int maximumBeauty(int[] nums, int k){
        Arrays.sort(nums);
       int l=0;
       int r=0;
       int max=0;
       int len=nums.length;
       int limit=2*k;
       while(r<len){
        while(nums[r]-nums[l] > limit){
            l++;

        }
        max=Math.max(max,r-l+1);
        r++;
       }
       return max;
    }
    }