class Solution {
    public int numRookCaptures(char[][] board) {
        int count=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                  
                    int col=j;
                   
                    while(col<8 && board[i][col]!='B'){
                       if(board[i][col]=='p'){
                       count++;
                       break;
                       }
                       col++;
                    }
                 
                    col=j;
                    while(col>=0 && board[i][col]!='B'){
                     
                       if(board[i][col]=='p'){
                        count++;
                        break;
                       }
                        col--;
                    }
                   
                    int row=i;
                    while(row<8&&board[row][j]!='B'){
                      
                       if(board[row][j]=='p'){
                        count++;
                        break;
                       }
                       row++;
                         
                    }
                   
                     row=i;
                    while(row>=0 &&board[row][j]!='B'){
    
                       if(board[row][j]=='p'){
                        count++;
                        break;
                       }
                       row--;
                         
                    }
                  
                    return count;
                }
            }
        }
        return 0;
    }
}