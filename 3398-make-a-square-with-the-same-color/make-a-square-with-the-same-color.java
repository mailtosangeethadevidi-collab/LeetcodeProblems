class Solution {
    public boolean canMakeSquare(char[][] grid) {
    int w=0;
    int b =0;
    if(grid[1][1]=='W'){
        w++;
    }
    else
      b++;

    if(grid[0][0]=='W') w++;
    else b++;

    if(grid[0][1]=='W') w++;
    else b++;

    if(grid[1][0]=='W') w++;
    else b++;

    if(b==4 || w==4 || b==3 || w==3)
      return true;
    
    w=0;
    b=0;
    if(grid[0][1]=='W') w++;
    else b++;

    if(grid[1][1]=='W') w++;
    else b++;

    if(grid[0][2]=='W') w++;
    else b++;

     if(grid[1][2]=='W') w++;
    else b++;

    if(b==4 || w==4 || b==3 || w==3)
      return true;

    w=0;
    b=0;
    if(grid[1][0]=='W') w++;
    else b++;

    if(grid[1][1]=='W') w++;
    else b++;

    if(grid[2][0]=='W') w++;
    else b++;
    
     if(grid[2][1]=='W') w++;
    else b++;

    if(b==4 || w==4 || b==3 || w==3)
      return true;

    w=0;
    b=0;
    if(grid[1][2]=='W') w++;
    else b++;

    if(grid[1][1]=='W') w++;
    else b++;

    if(grid[2][1]=='W') w++;
    else b++;
    
     if(grid[2][2]=='W') w++;
    else b++;

    if(b==4 || w==4 || b==3 || w==3)
      return true;
     return false;

    }
}