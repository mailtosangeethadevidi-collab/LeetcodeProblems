class Solution {
    public int removeElement(int[] nums, int val) {
        int i=-1;
      
        for(int j:nums){
            if(j!=val){
                nums[i+1]=j;
                i++;
            }
        }
        return i+1;
      }
}