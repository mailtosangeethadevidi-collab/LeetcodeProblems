class Solution {
    public int sumOfUnique(int[] nums) {
        int hash[]=new int[101];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]+=1;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(hash[nums[i]]==1)
              sum+=nums[i];
        }
        return sum;
    }
}