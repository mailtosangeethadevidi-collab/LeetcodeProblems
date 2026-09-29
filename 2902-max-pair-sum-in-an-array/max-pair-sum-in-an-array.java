class Solution {
    public int maxSum(int[] nums) {
       HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int largestDig=0;
            while(num!=0){
                largestDig=Math.max(largestDig,num%10);
                num/=10;
            }
          map.put(nums[i],largestDig);
        }
        int maxsum=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                 int digitI=map.get(nums[i]);
                 int digitJ=map.get(nums[j]);
                   if(digitI==digitJ){
                    maxsum=Math.max(maxsum,nums[i]+nums[j]);
                   }
            }
        }
        return maxsum;
      
    }
}