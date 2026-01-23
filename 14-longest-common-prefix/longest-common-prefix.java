class Solution {
    public String longestCommonPrefix(String[] strs) {
       String prefix="";
       String prev="";
       for(int i=0;i<strs[0].length();i++){
        prefix=strs[0].substring(0,i+1);
        int flag=0;
        for(int j=0;j<strs.length;j++){
            if(strs[j].startsWith(prefix)){
               flag=1;
            }
            else{
                flag=0;
                break;
            }
        }
        if(flag==1){
            prev=prefix;
        }
        if(flag==0 || prev.equals(strs[0])){
            return prev;
        }
       }
       return "";
       }
}