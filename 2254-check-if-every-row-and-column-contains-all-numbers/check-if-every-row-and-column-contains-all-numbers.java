class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int temp[]=new int[n+1];
        Arrays.fill(temp,1);
       
        for(int i=0;i<n;i++){
            int row[]=new int[n+1];
            int col[]=new int[n+1];
            for(int j=0;j<n;j++){
                if(row[matrix[i][j]]==1 || col[matrix[j][i]]==1)
                  return false;
                 row[matrix[i][j]]++;
                col[matrix[j][i]]++;
            }
          
        }
        return true;
    }
}