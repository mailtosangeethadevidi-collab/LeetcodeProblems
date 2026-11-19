class Solution {
    public String sortString(String s) {
       char hash[]=new char[26];
       for(char ch : s.toCharArray()){
        hash[ch-'a']++;
       }
       StringBuilder sb = new StringBuilder();
       
       while(true){
          
       int flag=0;
         for(char i='a';i<='z';i++){
            if(hash[i-'a']>0){
              flag=1;
              sb.append(i);
              hash[i-'a']--;
            }
         }
         if(flag==0)
           break;

          for(char i='z';i>='a';i--){
            if(hash[i-'a']>0){ 
              hash[i-'a']--;
              sb.append(i);
              
            }
         }
         System.out.println(sb.toString());
         if(flag==0)
           break;
       }
       return sb.toString();
        
    }
}