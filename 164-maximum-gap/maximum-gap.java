class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxdiff=0;
        for(int i=0;i<nums.length-1;i++){
            maxdiff=Math.max(maxdiff,nums[i+1]-nums[i]);
        }
        return maxdiff;
    }
}