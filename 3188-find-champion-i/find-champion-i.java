class Solution {
    public int findChampion(int[][] grid) {
        int mark[]=new int[grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(grid[i][j]==1){
                   mark[j]=-1;
                }
            }
        }
        for(int i=0;i<mark.length;i++){
            if(mark[i]!=-1){
                return i;
            }
        }
        return 0;
    }
}