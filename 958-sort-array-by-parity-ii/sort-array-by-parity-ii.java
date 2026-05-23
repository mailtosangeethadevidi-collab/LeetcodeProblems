class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int right=0;
        int left=1;
       while(right<nums.length&&left<nums.length){
          if(right%2==0&&nums[right]%2==0){
                  right+=2;
          }
          else if(left%2!=0&&nums[left]%2!=0){
            left+=2;
          }
          else{
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            right+=2;
            left+=2;
          }
       }
       return nums;
    }
}