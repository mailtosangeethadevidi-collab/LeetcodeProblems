class Solution {
    public int numSpecial(int[][] mat) {
        int row[]=new int[mat.length];
        int col[]=new int[mat[0].length];
        for(int i=0;i<row.length;i++){
            int oneCount=0;
            for(int j=0;j<col.length;j++){
                if(mat[i][j]==1)
                  oneCount++;
            }
            row[i]=oneCount;

        }

        for(int i=0;i<col.length;i++){
            int count=0;
            for(int j=0;j<row.length;j++){
                if(mat[j][i]==1){
                    count++;
                }
            }
            col[i]=count;
        }
           int ans=0;
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(mat[i][j]==1 && row[i] ==1 && col[j] ==1){
                    ans++;
                }
            }
        }
        return ans;
    }
}