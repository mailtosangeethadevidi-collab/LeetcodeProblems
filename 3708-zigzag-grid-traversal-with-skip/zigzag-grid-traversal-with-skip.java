class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> l = new ArrayList<>();
        int skip=1;
        for(int i=0;i<grid.length;i++){
           
            if(i%2==0){
                for(int j=0;j<grid[0].length;j++){
                    if(skip%2==1){
                        l.add(grid[i][j]);
                    }
                    skip++;
                }   
            }
            else{
                 for(int j=grid[0].length-1;j>=0;j--){
                    if(skip%2==1){
                        l.add(grid[i][j]);
                    }
                    skip++;
                }  
                
            }
          
        }
        return l ;
    }
}