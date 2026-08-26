class Solution {
    public boolean isValidSudoku(char[][] board) {
      for(int i=0;i<9;i++){
        int row[]=new int[10];
        int col[]=new int[10];
        for(int j=0;j<9;j++){
           
            if(board[i][j]!='.' && row[ board[i][j]-'0']==1) return false; 
            if(board[j][i]!='.' && col[ board[j][i]-'0']==1) return false; 
                
            if(board[i][j]!='.' )  row[board[i][j]-'0']+=1;
            
            if(board[j][i]!='.')  col[board[j][i]-'0']+=1;
           
            }
        }
       int r=0;
       while(r<9){
        int c=0;

        while(c<9){
            int block[]=new int[10];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            if(board[i+r][j+c]!='.' && block[board[i+r][j+c]-'0']==1) return false; 
           
            if(board[i+r][j+c]!='.' ) block[board[i+r][j+c]-'0']+=1;   
           
            }
        }
        c+=3;
        }

        r+=3;
       }
       return true;
    }
}