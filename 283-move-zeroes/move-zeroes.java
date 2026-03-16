class Solution {
    public int[] moveZeroes(int[] nums) {
         int i=0;
         int j=i+1;
         int n=nums.length;
         while(i<n && j<n){
             
            while(i<n&&nums[i]!=0){
                i++;
            }
           j=i;
            while(j<n&&nums[j]==0){
                j++;
            }
            if(j<n){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            }
            i++;
         }
         return nums;
    }
}