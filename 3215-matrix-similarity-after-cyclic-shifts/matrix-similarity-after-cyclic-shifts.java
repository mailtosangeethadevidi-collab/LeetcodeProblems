class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int shift=k%mat[0].length;
        for(int row[]:mat){
            for(int i=0;i<mat[0].length;i++){
                if(row[i]!=row[(i+shift)%mat[0].length]){
                    return false;
                }
            }
        }
     return true;
    }

}