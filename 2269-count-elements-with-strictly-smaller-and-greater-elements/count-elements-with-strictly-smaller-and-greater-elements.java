class Solution {
    public int countElements(int[] nums) {
       int count=0;
      // Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        int flag1=0;
        int flag2=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]>nums[i])
              flag1=1;
            else if(nums[j]<nums[i])
              flag2=1;
        }
        if(flag1==1&&flag2==1)
          count++;
       } 
       return count;
    }
}