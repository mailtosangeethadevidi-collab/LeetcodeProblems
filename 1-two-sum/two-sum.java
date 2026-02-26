class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp[]=new int[2];
        int flag=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i+1;j<nums.length;j++){
             
                sum=nums[i]+nums[j];
                if(sum==target){
                    flag=1;
                temp[0]=i;
                temp[1]=j;
                }          
            }
                if(flag==1){
                    return temp;
                }
        }
return temp;
    }
}