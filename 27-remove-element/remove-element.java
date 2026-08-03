class Solution {
    public int removeElement(int[] nums, int val) {
        int i=-1;
        int j=0;
        int n = nums.length;
        for(j=0;j<n;j++){
            if(nums[j]!=val){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
      }
}