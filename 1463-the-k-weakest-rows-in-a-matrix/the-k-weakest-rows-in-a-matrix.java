class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int r= mat.length;
        int col= mat[0].length;
        int [][] order=new int[r][2];
        for(int i=0;i<r;i++){
          
            
            int count=0;
           
                while(count<col&&mat[i][count]!=0){
                    count++;
                }
            
            order[i][0]=i;
            order[i][1]=count;

        }
         int res[]=new int[k];
       Arrays.sort(order, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]); // Ascending by count
            }
            return Integer.compare(a[0], b[0]);     // Tie-breaker: Ascending by row index
        });
        for(int i=0;i<k;i++){
             res[i]=order[i][0];
        }
        return res;

    }
}