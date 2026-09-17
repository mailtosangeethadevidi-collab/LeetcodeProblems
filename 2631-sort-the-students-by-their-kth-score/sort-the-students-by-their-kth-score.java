class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int temp[]=new int[score.length];
        for(int i=0;i<temp.length;i++){
            temp[i]=score[i][k];
        }

        Arrays.sort(temp);
        int row=0;
        int res[][]=new int[score.length][score[0].length];

       for(int i=score.length-1;i>=0;i--){

        int index=findIndex(score,temp[i],k);

        for(int j=0;j<score[0].length;j++){
           res[row][j]=score[index][j];
        }
        row++;

       }
       return res;
    }

    public int findIndex(int [][] score,int ele,int k){
        for(int i=0;i<score.length;i++){
            if(score[i][k]==ele){
                return i;
            }
        }

        return 0;
    }
}