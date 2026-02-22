class Solution {
    public int[] leftRightDifference(int[] nums) {
    int rs=0;
    int ls=0;
    for(int i=1;i<nums.length;i++){
          rs+=nums[i];
    }
    int ans[]=new int[nums.length];
    int i=0;
    for(i=0;i<nums.length-1;i++){
              ans[i]=Math.abs(rs-ls);
              rs-=nums[i+1];
              ls+=nums[i];
    }
    ans[i]=Math.abs(rs-ls);
    return ans;

    }
}