class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row= matrix.length;
        int col = matrix[0].length;
      
        for(int i=col-1;i>=0;i--){
           
           
            int r=0;
            int c=i;
            while(c<col&&r<row){
                if(matrix[r][c]!=matrix[0][i]){
                    return false;
                }
                r++;
                c++;
            }
           
        }
      
        int i=1;
        for( i=1;i<row;i++){
          
            int r=i;
            int c=0;
            while(r<row&&c<col){
                if(matrix[r][c]!=matrix[i][0]){
                    return false;
                }
                r++;
                c++;
            }

        }
        return true;
    }
}