class Solution {
    public boolean buddyStrings(String s, String goal) {
        int slen=s.length();
        int glen=goal.length();
        if(slen!=glen){
            return false;
        }
       char hash[]=new char[26];
       for(char ch : s.toCharArray()){
          hash[ch-'a']++;
       }
       int distinct=0;
       for(int i:hash){
        if(i!=0){
            distinct++;
        }
       }
       if(distinct==slen && s.equals(goal)){
        return false;
       }
       

        int count=0;
       for(int i=0;i<slen;i++ ){
        char chs=s.charAt(i);
        char chg=goal.charAt(i);
        if(chs!=chg){
            if(hash[chg-'a']!=0){
                if(!goal.contains(chs+""))
                  return false;
                count++;
                if(count>2){
                    return false;
                }

            }
            else{
                return false;
            }
        }
        else{
            hash[chg-'a']--;

        }

       }
       if(count==1)
         return false;
       
       return true;
    }
}