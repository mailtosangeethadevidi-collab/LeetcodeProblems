class Solution {
    public boolean canAliceWin(int n) {
        
        int counter=10;
        boolean turn=true;
        while(n>=counter){
            if(turn){
              n-=counter;
              counter--;
              turn=false;
            }
            else{
              n-=counter;
              counter--;
              turn=true;
            }
           
            if(n<counter&&!turn){
                return true;
            }
           
            
        }
    
    return false;
        
          
        
    }
}