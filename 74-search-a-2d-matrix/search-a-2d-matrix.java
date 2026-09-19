class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=matrix.length*matrix[0].length-1;
        int colLength=matrix[0].length;
        while(low<=high){
            int mid=(low+high)/2;

            int row=mid/colLength;
            int col=mid%colLength;
            int midele=matrix[row][col];
            if(midele==target){
                return true;
            } 
            else if(midele>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}