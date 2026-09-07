class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
       
        int c=0;
        while(c<matrix[0].length){
            int r=0;
            int max=0;
            while(r<matrix.length){
                max=Math.max(max,matrix[r][c]);
                r++;
            }
            r=0;
            while(r<matrix.length){
                if(matrix[r][c]==-1){
                    matrix[r][c]=max;
                }
                r++;
            }
            c++;
        }
        return matrix;
    }
}