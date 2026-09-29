class Solution {
    public boolean isGood(int[] nums) {
        int hash[]=new int[201];
         int n =nums.length;
         if(n==1){
            return false;
         }
        for(int i:nums){
            if(i>n){
                return false;
            }
            hash[i]++;
        }
       
        for(int i=1;i<nums.length;i++){
            if(i==n-1){
                if(hash[i]!=2){
                return false;
                }
                System.out.println("i==n-1 && hash[i]!=2");

            }
           else if(hash[i]!=1){
            System.out.println("hash[i]!=1");
                return false;
            }
        }
        return true;
    }
}