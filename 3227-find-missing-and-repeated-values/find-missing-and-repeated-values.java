class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
        int hash[]=new int[3500];
        int sum1=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                hash[grid[i][j]]+=1;
                if(hash[grid[i][j]]==2){
                  ans[0]=grid[i][j];
                  grid[i][j]=0;
                }
                 sum1+=grid[i][j];
            }
        }
        int n=grid.length*grid.length;
        ans[1]=((n*(n+1))/2)-sum1;
        return ans;
    }
}