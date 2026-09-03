class Solution {
    public int deleteGreatestValue(int[][] grid) {
       for(int []row:grid){
        Arrays.sort(row);
       }
       int col=grid[0].length-1;
       int row=0;
       int sum=0;
       while(col>=0){
        row=0;
        int max=0;
        while(row<grid.length){
            max=Math.max(max,grid[row++][col]);
        }
        sum+=max;
        col--;
       }
       return sum;
    }
}