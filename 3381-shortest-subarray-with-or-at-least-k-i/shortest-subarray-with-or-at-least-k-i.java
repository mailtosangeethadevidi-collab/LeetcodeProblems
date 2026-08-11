class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int or=0; 
            for(int j=i;j<n;j++){
              or|=nums[j];
              if(or>=k){
                min=Math.min(min,j-i+1);
              }
            }
        }
        if(min==Integer.MAX_VALUE)
          
        return -1;

        return min;
    }
}