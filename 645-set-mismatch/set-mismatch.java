class Solution {
    public int[] findErrorNums(int[] nums) {
    Arrays.sort(nums);
    int sum=0;
    int dup=0;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
          dup=nums[i];
        }
        sum+=nums[i];
    }
    int n=nums.length;
    sum+=nums[n-1];
    sum-=dup;
    return new int[]{dup,(n*(n+1))/2-sum};
    }
}