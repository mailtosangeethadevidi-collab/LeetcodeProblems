class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
      int n =nums.length;
      int maxlen=0;
        for(int l=0;l<n;l++){
           int r=n-1;
           if(l>0&&nums[l]==nums[l-1])
              continue;
           while(l<r){
                int diff=nums[r]-nums[l];
                
                 if(diff==1){
                    maxlen=Math.max(maxlen,r-l+1);
                    break;
                }
               else{
                    r--;
                }
        }
    }
    return maxlen;
    }
}