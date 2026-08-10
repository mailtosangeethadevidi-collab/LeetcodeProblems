class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        long product=1L;
        int l=0;
        int r=0;
        int n =nums.length;
        int count=0;
        if(k==0){
            return 0;
        }
        while(r<n){
            product*=nums[r];
            
            while(l<n&&product>=k){
                product/=nums[l];
                l++;
            }
           
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}