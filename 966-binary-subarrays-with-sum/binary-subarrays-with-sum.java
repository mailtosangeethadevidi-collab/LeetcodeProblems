class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        int l=0;
        int n=nums.length;
        int r=0;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==goal)
                 count++;
            }
        }
        return count;
    }
}