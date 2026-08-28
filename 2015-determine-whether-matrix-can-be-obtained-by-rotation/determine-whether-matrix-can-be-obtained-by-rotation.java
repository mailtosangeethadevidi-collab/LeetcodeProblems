class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int k=1;
        
        while(k<=4){
             if(Arrays.deepEquals(mat,target)){
                return true;
            }
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat.length;j++){
                    if(i>j){
                        int temp=mat[i][j];
                        mat[i][j]=mat[j][i];
                        mat[j][i]=temp;
                    }
                }
            }

            for(int i=0;i<mat.length;i++){
                int l=0;
                int r=mat.length-1;
                while(l<r){
                    int temp=mat[i][l];
                    mat[i][l]=mat[i][r];
                    mat[i][r]=temp;
                    l++;
                    r--;
                }
            }
           
            k++;
        }
       return false; 
    }
}