class Solution {
    public boolean canMakeSquare(char[][] grid) {
       int r=0;
      
       while(r<3){
         int c=0;
        while(c<3){
            int w=0;
            int b=0;
            for(int i=r;i<3 && i<r+2;i++){

                for(int j=c;j<3&&j<c+2;j++){
                    if(grid[i][j]=='W'){
                        w++;
                    }
                    else{
                        b++;
                    }

                }
           }
             System.out.println(w+" "+b);
           if(b==4 || w==4 || b==3 || w==3){
            return true;
           }
            c++;
            
        }
        r++;
       }
    return false;
    }
}