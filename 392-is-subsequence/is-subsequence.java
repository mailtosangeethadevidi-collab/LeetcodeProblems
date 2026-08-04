class Solution {
    public boolean isSubsequence(String s, String t) {
        
    int l=0;
    int r=0;
    int slength=s.length();
    char schar[]=s.toCharArray();
    if(slength==0)
      return true;
    for(char ch :t.toCharArray()){
        
        if(ch==schar[l]){
            l++;
        }
        if(l==slength){
            return true;
        }
    }
    return false;
    }
}