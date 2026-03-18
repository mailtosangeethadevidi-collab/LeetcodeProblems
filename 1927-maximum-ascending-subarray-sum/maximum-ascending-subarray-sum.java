class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=0;
        int maxsum=0;
        int i=0;
        for(i=0;i<nums.length-1;i++){
           if(nums[i]<nums[i+1]){
            sum+=nums[i];
           }
           else{
            sum+=nums[i];
            maxsum=Math.max(maxsum,sum);
            sum=0;
           }
        }
        sum+=nums[i];
        maxsum=Math.max(maxsum,sum);
        return maxsum;
    }
}