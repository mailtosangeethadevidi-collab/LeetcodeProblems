class Solution {
    public int diagonalPrime(int[][] nums) {
        int lar=0;
        int n = nums.length;

        for(int l=0;l<n;l++){
            lar= Math.max(lar,Math.max(isPrime(nums[l][n-l-1]),isPrime(nums[l][l])));
        }
        return lar;
    }
    public static int isPrime(int n){
        if(n<=1)
         return 0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
              return 0;
        }
        return n;
    }
}