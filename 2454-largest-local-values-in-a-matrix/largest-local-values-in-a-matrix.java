class Solution {
    public int[][] largestLocal(int[][] grid) {
        int row=0;
        int res[][]=new int[grid.length-2][grid.length-2];
        while(row<grid.length-2){
            int col=0;
            
            while(col<grid.length-2){
                int max=0;
                for(int r=row;r<=row+2;r++){
                    for(int c=col;c<=col+2;c++){
                    max=Math.max(max,grid[r][c]);
                    }
                }
                res[row][col]=max;
                col++;
            }
            row++;

        }
        return res;
    }
}