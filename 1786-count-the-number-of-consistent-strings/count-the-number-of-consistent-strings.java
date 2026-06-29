class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
             int flag=0;
         for(int m=0;m<words[i].length();m++){
           
             if(!allowed.contains(String.valueOf(words[i].charAt(m)))){
                flag=1;
                break;
             }
         }
         if(flag!=1){
            count++;
         }
        }
        
        return count;
    }
}