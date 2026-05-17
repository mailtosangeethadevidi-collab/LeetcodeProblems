class Solution {
    public int strStr(String haystack, String needle) {
   
   int i=0;
   int index=0;
   int j=needle.length();
      while(j<=haystack.length()){
     if((haystack.substring(i,j)).equals(needle))
     return index;
     else{
        j++;
        i++;
        index++;
     }
}
      return -1;
    }
}