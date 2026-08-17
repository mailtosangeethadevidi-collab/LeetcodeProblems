class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int diff=0;
        int maxFreq=0;
        int count=1;
        int l=0;
        int r=0;
        int len=nums.length;
        while(r<len){
            
            int increments=0;
            for(int i=r-1;i>=0;i--){
               if(nums[i]<nums[r] && increments<k){
                    increments+=(nums[r]-nums[i]);
                    if(increments<=k)
                    count++;
               }
               else
                 break;
            }
            while(r<len-1 && nums[r]==nums[r+1]){
                r++;
                count++;
            }
          
                r++;
                maxFreq=Math.max(maxFreq,count);
                count=1;
            
              
        }
         maxFreq=Math.max(maxFreq,count);
        return maxFreq;
    }
}