class Solution {
    public int countQuadruplets(int[] nums) {
        int limit=nums.length-4;
        int count=0;
        
         for(int i=0;i<=limit;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){

                    int sum=nums[i]+nums[j]+nums[k];

                    for(int l=k+1;l<nums.length;l++){
                        if(sum==nums[l])
                        count++;
                    }
                }
            }
         }
        
       return count;
    }
}