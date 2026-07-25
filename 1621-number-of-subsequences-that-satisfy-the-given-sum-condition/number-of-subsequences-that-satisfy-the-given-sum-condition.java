class Solution {
    public int numSubseq(int[] nums, int target) {
       
        int count=0;
      
        int j=nums.length-1;
        int mod=1_000_000_007;
        int power[]=new int[j+1];
        power[0]=1;
        for(int i=1;i<j+1;i++){
            power[i]=(power[i-1]*2)%mod;
        }
         Arrays.sort(nums);
          int i=0;
        while(i<=j){
            int sum=nums[i]+nums[j];
           
           
            if(sum<=target){
            count=(count+power[j-i])%mod;
             
                i++;

            }
            else{
              j--;
            }
           
        }
        return count;
    }
}