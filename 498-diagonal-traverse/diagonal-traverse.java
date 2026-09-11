class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
       List<List<Integer>> l = new ArrayList<>();
      
       int arr[]=new int[mat.length*mat[0].length];
       int diagonal=0;
       for(int i=0;i<mat[0].length;i++){
         List<Integer> ll= new ArrayList<>();
         int left=0;
         int right=i;
         while(left<mat.length && right>=0){
            ll.add(mat[left][right]);
            left++;
            right--;

         }
         if(diagonal%2==0){
            Collections.reverse(ll);
            l.add(ll);
         }
         else{
            l.add(ll);
         }
         diagonal++;
       }


       for(int i=1;i<mat.length;i++){
        int left=i;
        int right=mat[0].length-1;
        List<Integer> ll= new ArrayList<>();
        while(left<mat.length && right>=0){
            ll.add(mat[left][right]);
            left++;
            right--;
        }
         if(diagonal%2==0){
            Collections.reverse(ll);
            l.add(ll);
         }
         else{
            l.add(ll);
         }
         diagonal++;
       }
       int k=0;
     for(List<Integer> num:l){
        for(Integer i : num){
            arr[k++]=i;
        }
     }
  return arr;
    }
}