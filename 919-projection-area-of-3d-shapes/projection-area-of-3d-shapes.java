class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int area=0;
       
        int zeroCount=0;
        for(int i=0;i<n;i++){
            // side view  - max element in each column
            int maxc=0;
            for(int r=0;r<n;r++){
                if(grid[r][i]==0){
                    zeroCount++;
                }
                if(grid[r][i]>maxc){
                    maxc=grid[r][i];
                }
            }
            area+=maxc;

            // front view - max element in each row
            int maxr=0;
            for(int c=0;c<n;c++){
                if(grid[i][c]>maxr){
                    maxr=grid[i][c];
                }
            }
            area+=maxr;
        }
        return area+(n*n-zeroCount);
    }
}