class Solution {
    public int myAtoi(String s) {
     char arr[] = s.trim().toCharArray();
      int len=arr.length;
      if((len>=2 &&arr[0]=='+' && arr[1]=='-') || len==0)
        return 0;
     if((len>=2 && arr[0]=='-' && arr[1]=='+'))
       return 0;
        if((len>=2 && arr[0]=='-' && arr[1]=='-'))
       return 0;
     if((len>=2 && arr[0]=='+' && arr[1]=='+'))
       return 0;
   
      
      int index=0;

      for(index=0;index<len;index++){
          if(arr[index]!=0 && arr[index]!='-' && arr[index]!='+')
            break;
      }
      
      if(index==len)
         return 0;
     
       long num = 0;
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