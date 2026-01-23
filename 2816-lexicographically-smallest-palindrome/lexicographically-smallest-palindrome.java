class Solution {
    public String makeSmallestPalindrome(String s) {
        char arr[]=s.toCharArray();
        int i=0;
        int n=s.length()-1;
        char temp='1';
        while(i<n){
            if(arr[i]!=arr[n]){
              char smaller=(char)Math.min(arr[i],arr[n]);
           arr[i]=smaller;
           arr[n]=smaller;
               }
               i++;
               n--;
            
        }
        return new String(arr);
    }
}