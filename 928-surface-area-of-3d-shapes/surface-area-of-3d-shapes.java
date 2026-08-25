class Solution {
    public int surfaceArea(int[][] grid) {
        int n=grid.length;
        int area=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
                 if(grid[i][j]==0)
                   continue;   
            int  faces=6*grid[i][j];
             // top
               faces-=(2*grid[i][j]-2);
           
               if(i+1<n){
               faces-=2*Math.min(grid[i][j],grid[i+1][j]);
               }
           
              if(j+1<n){
              faces-=2*Math.min(grid[i][j+1],grid[i][j]);
            }
            
        area+=faces;
        }
       } 
       return area;
    }
}