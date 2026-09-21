class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int row=0;row<matrix.length;row++){
            int low=0;
            int high=matrix[0].length-1;
            if(matrix[row][0]<=target && target <=matrix[row][high]){
                while(low<=high){
                    int mid=(low+high)/2;

                    if(matrix[row][mid]==target){
                        return true;
                    }
                    else if(matrix[row][mid]>target){
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
                }
            }
           
        }
        return false;
       
    }
}