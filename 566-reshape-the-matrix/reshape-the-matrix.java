class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length != r*c)
          return mat;
        int m[][]=new int[r][c];
        List<Integer> l = new LinkedList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                l.add(mat[i][j]);
              
            }
        }
            int k=0;
            for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 m[i][j]=l.get(k++);
            }
           }
           return m;
    }
}