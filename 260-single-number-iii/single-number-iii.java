class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        for(int i=0;i<nums.length-1;){
            if(nums[i]==nums[i+1]){
              i+=2;
            }
            else{
                nums[k++]=nums[i];
                i++;
            }
              
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            nums[1]=nums[nums.length-1];
        }
        return Arrays.copyOf(nums,2);
    }
}