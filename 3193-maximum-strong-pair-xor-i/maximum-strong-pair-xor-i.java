class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max=0;
        int i=0;
        int j=i+1;
        Arrays.sort(nums);
        int n =nums.length;
        while(i<n){
            j=n-1;
            while(i<j){
                int diff = Math.abs(nums[i]-nums[j]) ;
                
                if(diff>nums[i]){
                    j--;
                }
                else{
                max=Math.max(max,nums[i]^nums[j]);
               j--;
                }
            }
            i++;
        }
        return max;
    }
}