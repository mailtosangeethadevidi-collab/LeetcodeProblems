class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        if(row*col != r*c)
          return mat;
        int matrix[][]=new int[r][c];
       
         int x=0;
         int y=0;
        
        
        
            for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
             matrix[x][y++]=mat[i][j]; 
              if(y==c){
                x++;
                y=0;
              }
                 
            }
           }
       
           
           return matrix;
    }
}