class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
       
        int hash[]=new int[51];
        int n=nums.length;
        int suffix[]=new int[n];
        suffix[n-1]=0;
        for(int i= nums.length-2;i>=0;i--){
            if(hash[nums[i+1]]==0){
               suffix[i]=suffix[i+1]+1;
            }
            else
             suffix[i]=suffix[i+1];

             hash[nums[i+1]]++;
        }
        Arrays.fill(hash,0);
        int prefix=1;
        hash[nums[0]]++;
        for(int i=1;i<n;i++){
            int num=nums[i];
            if(hash[nums[i]]==0){
                prefix++;
                nums[i]=prefix-suffix[i];
            }
            else{
                nums[i]=prefix-suffix[i];
            }
            hash[num]++;
        
        }
        nums[0]=1-suffix[0];

        return nums;
        
    }
}