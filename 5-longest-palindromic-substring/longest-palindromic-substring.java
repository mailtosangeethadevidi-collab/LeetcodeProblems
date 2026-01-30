class Solution {
    public String longestPalindrome(String s) {
        int maxlen=0;
         String maxpalin="";
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        for(int j=s.length()-1;j>=i;j--){
            if(ch==s.charAt(j)){
                String str=s.substring(i,j+1);
                char arr[]=str.toCharArray();
                int l=0;
                int r=arr.length-1;
                int flag=0;
                if(str.length()>maxlen){
                while(l<r){
                    if(arr[l]!=arr[r]){
                        flag=1;
                        break;
                    }
                    l++;
                    r--;
                }
            }
                if(flag==0){
                    if(str.length()>maxlen){
                        maxlen=str.length();
                        maxpalin=str;
                    }
                }

            }
        }
      }
      return maxpalin;
    }
}