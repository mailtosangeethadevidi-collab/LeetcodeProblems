class Solution {
    public int myAtoi(String s) {
        String str=s.trim();
     char arr[] = str.toCharArray();
      int len=arr.length;
      if(len==0)
        return 0;
      if(len>=2){
      if((arr[0]=='+' && arr[1]=='-'))
        return 0;
     if(arr[0]=='-' && arr[1]=='+')
       return 0;
        if( arr[0]=='-' && arr[1]=='-')
       return 0;
     if(arr[0]=='+' && arr[1]=='+')
       return 0;
      }
      
    
       long num = 0;
       int index=0;
       if(arr[0]=='-'|| arr[0]=='+')
          index=1;
       for(int i=index;i<len;i++){

            if(Character.isDigit(arr[i])){

                 num=num*10 + (long)(arr[i]-'0');
         if(arr[0]=='-'&&(-num)<=Integer.MIN_VALUE)
           return Integer.MIN_VALUE;
         if(arr[0]!='-'&&num>=Integer.MAX_VALUE)
          return Integer.MAX_VALUE;
           
              }  else 
                break;
           
       }


         
         if(arr[0]=='-'){
            num=-num;
         }

       
      return (int)num;
       
    }
}