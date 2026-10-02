class Solution {
    public String[] findWords(String[] words) {
    int hash[]=new int[26];
       for(char ch :"qwertyuiop".toCharArray()){
         hash[ch-'a']=1;
       }
      for(char ch :"asdfghjkl".toCharArray()){
         hash[ch-'a']=2;
       }
       for(char ch :"zxcvbnm".toCharArray()){
        hash[ch-'a']=3;
       }
     int n=words.length;
     String res[]=new String[n];
     int index=0;
    for(int i=0;i<n;i++){
       boolean isvalid=true;
        int row=-1;
        for(char ch : words[i].toLowerCase().toCharArray()){
            if(row==-1){
                row=hash[ch-'a'];
            }
            else if(hash[ch-'a']!=row){
                isvalid=false;
                break;
            }
        }
        if(isvalid){
            res[index++]=words[i];
        }
        
    }
    return Arrays.copyOfRange(res,0,index);
    }
}