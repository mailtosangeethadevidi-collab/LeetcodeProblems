class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            if(isPrime(Integer.bitCount(i)))
            count++;
        }
        return count;
        
    }
    private boolean isPrime(int num){
       return num == 2 || num == 3 || num == 5 || num == 7 || 
               num == 11 || num == 13 || num == 17 || num == 19 || 
               num == 23 || num == 29 || num == 31;
    }
}