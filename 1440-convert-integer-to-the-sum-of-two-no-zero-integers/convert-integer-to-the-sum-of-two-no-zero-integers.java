class Solution {
    public int[] getNoZeroIntegers(int n) {
       
        for(int i=1;i<=n;i++){
             int i1=i;
        int i2=n-i;
        if(i+(n-i)==n){
         if((i>=100&&i<=110)|| (i>=1000&&i<=1010)|| (i==10000) || (i==10)){
                  continue;
            }
     if((i2>=100&&i2<=110)|| (i2>=1000&&i2<=1010) || (i2==10000) || (i2==10)){
               continue;
        }
       
         else {
            int flag=0;
               while(i1!=0){
                 if(i1%10==0){
                 flag=1;
                   break;
                 }
                 i1/=10;
               }
               while(i2!=0){
                 if(i2%10==0){
                 flag=1;
                   break;
                 }
                 i2/=10;
               }
               if(flag==0)
                return new int[]{i,(n-i)};
         }
     
    } 
   
}
 return new int[]{0};

    }
}