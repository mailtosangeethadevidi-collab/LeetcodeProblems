class Solution {
    public int[][] imageSmoother(int[][] img) {
        int r= img.length;
        int c= img[0].length;
        int res[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int n=1;
                int sum=img[i][j];
                if(i-1>=0){
                    n++;
                    sum+=img[i-1][j];
                }
                if(i+1<r){
                    n++;
                    sum+=img[i+1][j];
                   
                }
                if(j+1 <c){
                    n++;
                    sum+=img[i][j+1];
                }
                if(j-1 >=0){
                    n++;
                    sum+=img[i][j-1];
                }
                 // top - left diagonal 
                    if(j-1>=0&&i-1>=0){
                    n++;
                    sum+=img[i-1][j-1];
                    }
                  
                    // top- right diagona;
                    if(j+1<c&&i-1>=0){
                    n++;
                    sum+=img[i-1][j+1];
                    }
                      
                     // bottom-left diagonal 
                    if(j-1 >=0&&i+1<r){
                    n++;
                    sum+=img[i+1][j-1];
                    }
                    // top- right diagona;
                    if(j+1<c && i+1<r){
                    n++;
                    sum+=img[i+1][j+1];
                    }
              res[i][j]=(sum/n);

            }

        }
        return res;
    }
}