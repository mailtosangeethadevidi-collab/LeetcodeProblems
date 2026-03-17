class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int n=nums.length;
        int right=n-1;
      int fi=binarysearch(left,right,nums,target);
      int li=bs(left,right,nums,target);
      
      return new int []{fi,li};

     }
    
    public static int binarysearch(int left,int right,int[] nums,int target){
        int index=-1;
          while(left<=right){
          int mid=(left+right)/2;
          if(target==nums[mid]){
            index=mid;
            right=mid-1;
          }
          else if(nums[mid]<target)
            left=mid+1;
          else if(nums[mid]>target)
            right=mid-1;
    }
    return index;
    }
     public static int bs(int left,int right,int[]nums,int target)  {
           int index=-1;
          while(left<=right){
          int mid=(left+right)/2;
          if(target==nums[mid]){
            index=mid;
            left=mid+1;
          }
          else if(nums[mid]<target)
            left=mid+1;
          else if(nums[mid]>target)
            right=mid-1;
          }
    return index;
    }
    
}
    