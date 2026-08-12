class Solution {
    public int findGCD(int[] nums) {
       int min=Integer.MAX_VALUE;
       int max=0;
       for(int i : nums){
        if(i>max){
            max=i;
        }
        if(i<min){
            min=i;
        }
       }
       
       int a=max;
       int b=min;
       while(b!=0){
        int rem=a%b;
        a=b;
        b=rem;

       }
       return a;
    }
}