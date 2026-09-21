class Solution {
    public int kthSmallest(int[][] matrix, int k) {

       Map<Integer,Integer> map = new TreeMap<>();
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix.length;j++){
            map.put(matrix[i][j],map.getOrDefault(matrix[i][j],0)+1);
        }
       }
       int count=0;
       for(Integer key : map.keySet()){
           count+=map.get(key);
           if(count>=k){
            return key;
           }
         
       }
       return 0;
    }
}