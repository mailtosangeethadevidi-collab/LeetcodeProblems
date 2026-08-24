class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int top=0;
        int left=0;
        int right=c-1;
        int bottom=r-1;
        List<Integer> l = new ArrayList<>();
        while(top<=bottom && left<=right){
            // left to right
            for(int i=left;i<=right;i++){
                l.add(matrix[top][i]);
            }
            top++;

            // top-bottom
            for(int j=top;j<=bottom;j++){
                l.add(matrix[j][right]);
            }

            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    l.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int j=bottom;j>=top;j--){
                    l.add(matrix[j][left]);
                }
                left++;
            }

        }
        return l;
    }
}