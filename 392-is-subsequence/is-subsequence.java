class Solution {
    public boolean isSubsequence(String s, String t) {
        
    int l=0;
    int r=0;
    int slength=s.length();
    if(slength==0)
      return true;
    for(char ch :t.toCharArray()){
        char schar=s.charAt(l);
        if(ch==schar){
            l++;
        }
        if(l>=slength){
            return true;
        }
    }
    return false;
    }
}