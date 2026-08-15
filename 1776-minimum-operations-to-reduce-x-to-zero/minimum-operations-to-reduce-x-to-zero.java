class Solution {
    public int minOperations(int[] nums, int x) {
       
        int n= nums.length;
        int totalSum=0;

        for(int i:nums){
         totalSum+=i;
        }

        int target=totalSum-x;

        if(target==0)
            return n;
           

         int l=0;
         int r=0;

         int maxlen=-1;
         int currSum=0;
         for(r=0;r<n;r++){
            currSum+=nums[r];
            while( l<=r &&currSum>target){
                currSum-=nums[l];
                l++;
            }
            if(currSum==target){
                maxlen=Math.max(maxlen,r-l+1);
            }
         }
        return maxlen==-1? -1 : n-maxlen; 
    }
}