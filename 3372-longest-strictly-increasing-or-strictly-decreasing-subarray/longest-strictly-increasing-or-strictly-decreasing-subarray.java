class Solution {
    public int longestMonotonicSubarray(int[] nums) {
       int len=nums.length;
      if(len==1)
        return 1;
      int max1=0;
      int count=1;
    //   increasing
      for(int i=0;i<len-1;i++){
         if(nums[i]<nums[i+1])
           count++;
         else
           {
            max1=Math.max(max1,count);
            count=1;
           }
      }
      max1=Math.max(max1,count);
      int max2=0;
      count=1;
    //   decreasing
      for(int i=0;i<len-1;i++){
         if(nums[i]>nums[i+1])
           count++;
         else
           {
            max2=Math.max(max2,count);
            count=1;
           }
      }
      max2=Math.max(max2,count);
    //   System.out.println("1="+max1+"--"+"2="+max2);
      return Math.max(max1,max2);

    }
}