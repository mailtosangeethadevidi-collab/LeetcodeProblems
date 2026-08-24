class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row= matrix.length;
        int col = matrix[0].length;
        if(row==1 || col==1){
            return true;
        }
        for(int i=col-1;i>=0;i--){
            int value=matrix[0][i];
           
            int r=0;
            int c=i;
            while(c<col&&r<row){
                if(matrix[r][c]!=value){
                    return false;
                }
                r++;
                c++;
            }
           
        }
      
        int i=1;
        for( i=1;i<row;i++){
            int val=matrix[i][0];
           
            int r=i;
            int c=0;
            while(r<row&&c<col){
                if(matrix[r][c]!=val){
                    return false;
                }
                r++;
                c++;
            }

        }
        return true;
    }
}