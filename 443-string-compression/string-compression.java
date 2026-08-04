class Solution {
    public int compress(char[] chars) {
        int count=1;
       
      
       int r=0;
       if(chars.length<=1){
        return chars.length;
       }
       StringBuilder sb = new StringBuilder();
        for(r=0;r<chars.length-1;r++){
            if(chars[r]==chars[r+1]){
                count++;
            }
            else{

               sb.append(chars[r]);
                if(count>1){

                    sb.append(count);
                }
                count=1;
            }
               
        }
         sb.append(chars[r]);
        if(count>1){
                     sb.append(count);
                
           
        }

       
        r=0;
        for(char ch:sb.toString().toCharArray()){
           chars[r++]=ch;
        }
       return r;
    }
}