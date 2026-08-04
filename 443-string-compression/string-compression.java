class Solution {
    public int compress(char[] chars) {
        int count=1;
       
      int n =chars.length;
       int r=0;
       if(n==1){
        return n;
       }
       StringBuilder sb = new StringBuilder();
        for(r=0;r<n-1;r++){
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