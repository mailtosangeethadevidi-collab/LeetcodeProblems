class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows =image.length;
        int c = image[0].length;
        for(int i=0;i<rows;i++){
           int l=0;
           int r=c-1;
          while(l<r){
            if(image[i][l]==0){
                int temp=image[i][r];
                image[i][r]=1;
                if(temp==0){
                    image[i][l]=1;
                }
                else{
                    image[i][l]=0;
                }
            }
            else{
                int temp=image[i][r];
                image[i][r]=0;
                if(temp==0){
                    image[i][l]=1;
                }
                else{
                    image[i][l]=0;
                }

            }
            l++;
            r--;
          }
          if(l==r){
            if(image[i][l]==0){
                image[i][l]=1;
            }
            else
               image[i][l]=0;

          }
        }
        return image;
    }
}