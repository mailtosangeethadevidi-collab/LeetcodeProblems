class Solution {
    public int minimumOperations(int[][] grid) {
        int opns=0;
        for(int col=0;col<grid[0].length;col++){
            for(int row=1;row<grid.length;row++){
                if(grid[row][col]<=grid[row-1][col]){
                   opns+=Math.abs(grid[row][col] - grid[row-1][col])+1;
                   grid[row][col]+=Math.abs(grid[row][col] - grid[row-1][col])+1;
                }

            }
        }
        return opns;
    }
}