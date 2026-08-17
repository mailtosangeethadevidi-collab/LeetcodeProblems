class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0;
        int r=0;
        int maxsum=0;
        int sum=0;
       
       boolean [] seen = new boolean[10001];
        int len=nums.length;
        while(r<len){

           sum+=nums[r];
           while(seen[nums[r]]){
               int leftNum=nums[l];
               sum-=leftNum;
               seen[leftNum]=false;
               l++;
                
            }

           seen[nums[r]]=true;

            maxsum=Math.max(maxsum,sum);
             r++;
        }
        return maxsum;
    }
}