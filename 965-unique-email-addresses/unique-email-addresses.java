class Solution {
    public int numUniqueEmails(String[] emails) {
       Set<String> uniqueEmails=new HashSet<>();
       for(int i=0;i<emails.length;i++){
        String str=emails[i];
        String local="";
         int indexOfPlus=str.indexOf('+');
         int indexOfAt=str.indexOf('@');
         String domain=str.substring(indexOfAt+1);
         if(indexOfPlus!=-1){
            local=str.substring(0,indexOfPlus);
         }
         else{
            local=str.substring(0,indexOfAt);
         }
        
          uniqueEmails.add(local.replace(".","")+"@"+domain);

       } 
       return uniqueEmails.size();
    }
}