class Solution {
    public int minDeletionSize(String[] strs) {
       int res=0;
       int index=0;
       int strLen=strs[0].length();

       while(index<strLen){
       for(int i=0;i<strs.length-1;i++){
          
                if(strs[i].charAt(index)>strs[i+1].charAt(index))
                  {
                    res++;
                    break;
                  }
           
       }
           index++;
         
       }
       return res;
        
    }
}