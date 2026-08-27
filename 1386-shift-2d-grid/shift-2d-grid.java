class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       
        while(k>0){
        int c=grid[0].length-1;
        while(c>0){
          for(int r=0;r<grid.length;r++){
             int temp=grid[r][c];
             grid[r][c]=grid[r][c-1];
             grid[r][c-1]=temp;
          }
          c--;
        }
        int last=grid[grid.length-1][0];
        for(int r=grid.length-1;r>0;r--){
           grid[r][0]=grid[r-1][0];
        }
        grid[0][0]=last;
        k--;
        }
        return Arrays.stream(grid)
                     .map(row -> Arrays.stream(row)
                                       .boxed()
                                       .collect(Collectors.toList()))
                     .collect(Collectors.toList());
    }

}