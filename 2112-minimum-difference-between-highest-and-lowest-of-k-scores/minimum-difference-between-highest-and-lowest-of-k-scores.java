class Solution {
    public int minimumDifference(int[] nums, int k) {
      int min=Integer.MAX_VALUE;
      Arrays.sort(nums);
      int l=0;
      int r=k-1;
      while(r<nums.length){
        min =Math.min(nums[r]-nums[l],min);
        l++;
        r++;
      }
      return min;  
    }
}