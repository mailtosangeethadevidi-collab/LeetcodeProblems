class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

    List<Integer> max= new ArrayList<>();
    List<Integer> min= new ArrayList<>();
     for(int i=0;i<matrix.length;i++){
        int mi=Integer.MAX_VALUE;
        for(int j=0;j<matrix[i].length;j++){
          if(matrix[i][j]<mi){
            mi=matrix[i][j];
          }

        }
        min.add(mi);
     }

     for(int i=0;i<matrix[0].length;i++){
       int ma=0;
       for(int j=0;j<matrix.length;j++){
         if(matrix[j][i]>ma){
            ma=matrix[j][i];
         }
       }
      if(min.contains(ma)){
         max.add(ma);
         return max;
      }

     }
     return max;
     
    }
}