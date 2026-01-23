class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long subarr=0;
        int zerocount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zerocount++;
                subarr+=zerocount;
            }
            else{
                zerocount=0;
            }
        }
        return subarr;
    }
}