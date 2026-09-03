class Solution {
    public int[] findColumnWidth(int[][] grid) {
         int res[]=new int[grid[0].length];
        for(int col=0;col<grid[0].length;col++){
            int maxlen=0;
            for(int row=0;row<grid.length;row++){
                if(grid[row][col]==0){
                    maxlen=Math.max(maxlen,1);
                }
                else if(grid[row][col]<0){
                    maxlen=Math.max(maxlen,(int)(Math.log10(Math.abs(grid[row][col]))+2));
                }
                else
                maxlen=Math.max(maxlen,(int)(Math.log10(grid[row][col])+1));
            }
            res[col]=maxlen;
           
        }
        return res;
    }
}