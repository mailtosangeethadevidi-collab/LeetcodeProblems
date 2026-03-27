class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int k) {
        int count=0;
        if(flowerbed.length==1){
            if((flowerbed[0]==0&&k==1)|| flowerbed[0]==1&&k==0 ||flowerbed[0]==0&&k==0)
              return true;
            else
              return false;
        }
         if(flowerbed.length==2){
            if((flowerbed[0]==1||flowerbed[1]==1)){
                if(k==0)
              return true;
            }
            if(flowerbed[0]==0 &&flowerbed[1]==0 &&k==1){
               return true;
            }
            else
              return false;
        }
         
        if(flowerbed[0]==0 &&flowerbed[1]==0){
          count++;
          flowerbed[0]=1;
        }
      for(int i=1;i<flowerbed.length-1;i++){
     if(flowerbed[i-1]==0&&flowerbed[i]==0&&flowerbed[i+1]==0){
      flowerbed[i]=1;
      count++;
 }
    }
 if(flowerbed[flowerbed.length-1]==0 &&flowerbed[flowerbed.length-2]==0){
          count++;
        }
        
 if(count>=k){
   return true;
      }
     return false; 
    }
}