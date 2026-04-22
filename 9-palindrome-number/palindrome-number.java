class Solution {
    public boolean isPalindrome(int x) {
        int result=0,temp=x;
        if(x<0)
        return false;
        while(x!=0){
            int rem = x%10;
            result = result*10+rem;
            x=x/10;
        }
        if(result==temp)
        return true;
        else 
        return false;
        
    }
}