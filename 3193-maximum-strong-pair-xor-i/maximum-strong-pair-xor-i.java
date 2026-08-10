class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max=0;
        int i=0;
        int j=i+1;
        Arrays.sort(nums);
        int n =nums.length;
        while(i<n){
            j=i+1;
            while(j<n && Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                max=Math.max(max,nums[i]^nums[j]);
                j++;
            }
            i++;
        }
        return max;
    }
}