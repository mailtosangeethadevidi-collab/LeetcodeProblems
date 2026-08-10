class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum=Integer.MAX_VALUE;
         
        while(l<=r){
            int i=0;
           int j=0;
            int sum=0;
            while(j<l){
                sum+=nums.get(j);
                j++;
            }
           if(sum>0)
            minSum=Math.min(minSum,sum);

            int n = nums.size();
            while(j<n){
                    sum=sum-nums.get(i);
                    sum+=nums.get(j);
                    if(sum>0){
                    minSum=Math.min(minSum,sum);
                    }
                    i++;
                    j++;
            }
            l++;
        }
        return minSum!=Integer.MAX_VALUE ? minSum : -1; 
    }
}