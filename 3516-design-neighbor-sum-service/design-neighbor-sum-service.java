class NeighborSum {
    int grid[][];

    public NeighborSum(int[][] g) {
      this.grid=g;
    }
 
    public int adjacentSum(int value) {
        int row=0;
        int col=0;
      for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[i][j]==value){
                    row=i;
                    col=j;
                }
            }
        }
      int sum=0;
      if(row+1<grid.length){
        sum+=grid[row+1][col];
      }
      if(col+1<grid.length){
        sum+=grid[row][col+1];
      }
      if(col-1>=0){
        sum+=grid[row][col-1];
      }
      if(row-1>=0){
        sum+=grid[row-1][col];
      }
      return sum;
       
    }
    
    public int diagonalSum(int value) {
        int row=0;
        int col=0;
      for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[i][j]==value){
                    row=i;
                    col=j;
                }
            }
        }
      int sum=0;
      if(row+1<grid.length && col-1 >=0){
        sum+=grid[row+1][col-1];
      }
      if(col+1<grid.length&& row+1<grid.length){
        sum+=grid[row+1][col+1];
      }
      if(row-1>=0&&col-1>=0){
        sum+=grid[row-1][col-1];
      }
      if(row-1>=0 && col+1<grid.length){
        sum+=grid[row-1][col+1];
      }
      return sum;    
        
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */