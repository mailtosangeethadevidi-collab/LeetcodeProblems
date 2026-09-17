class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp[]=new int[score.length];
        for(int i=0;i<temp.length;i++){
            temp[i]=score[i][k];
            map.put(temp[i],i);
        }

        Arrays.sort(temp);
        int row=0;
        int res[][]=new int[score.length][score[0].length];

       for(int i=score.length-1;i>=0;i--){

        int index=map.get(temp[i]);

        for(int j=0;j<score[0].length;j++){
           res[row][j]=score[index][j];
        }
        row++;

       }
       return res;
    }

    
}