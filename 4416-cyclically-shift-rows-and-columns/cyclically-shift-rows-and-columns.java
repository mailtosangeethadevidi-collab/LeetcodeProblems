class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        for(int i=0;i<n;i++){
            int shifts=rowShift[i];
            int temp[]=new int[n];
            for(int j=0;j<n;j++){
                int pos=(j-shifts+n)%n;
                temp[pos]=grid[i][j];
            }
          
            for(int j=0;j<n;j++){
                grid[i][j]=temp[j];
            }
            
        }
         for(int j=0;j<n;j++){
            int shifts=colShift[j];
            int temp[]=new int [n];
            for(int i=0;i<n;i++){
                int pos=(i-shifts+n)%n;
                temp[pos]=grid[i][j];
            }
            
            for(int i=0;i<n;i++){
                grid[i][j]=temp[i];
            }
            
        }
        return grid;
    }
}