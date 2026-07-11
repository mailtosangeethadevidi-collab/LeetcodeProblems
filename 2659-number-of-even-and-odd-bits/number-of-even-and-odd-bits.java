class Solution {
    public int[] evenOddBit(int n) {
        String str=Integer.toBinaryString(n);
        int even=0;
        int odd=0;
        int len=str.length();
        for(int i=0;i<len;i++){
            if(str.charAt(len-i-1)=='1'){
                if(i%2==0){
                    even++;
                }
                else
                odd++;
            }
        }
        return new int[]{even,odd};
    }
}