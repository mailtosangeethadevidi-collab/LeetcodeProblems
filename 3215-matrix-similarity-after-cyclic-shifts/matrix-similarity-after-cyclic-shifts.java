class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int t[][] = new int[mat.length][];
        for (int i = 0; i < mat.length; i++) {
            t[i] = mat[i].clone();
        }
        while (k-- != 0) {
            int i = 0;
            boolean even = true;
            while (i < mat.length) {
                if (even) {
                    int temp = mat[i][0];
                    int j = 0;
                    for (j = 0; j < mat[0].length - 1; j++) {
                        mat[i][j] = mat[i][j + 1];
                    }
                    mat[i][j] = temp;

                    even = false;
                } else {
                    int temp = mat[i][mat[0].length - 1];
                    int j = 0;
                    for (j = mat[0].length - 1; j >= 1; j--) {
                        mat[i][j] = mat[i][j - 1];
                    }
                    mat[i][j] = temp;
                    even = true;
                }
                i++;

            }
        }
       
        return Arrays.deepEquals(t, mat);
    }
}