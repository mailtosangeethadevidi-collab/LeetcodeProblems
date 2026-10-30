class Solution {
    public boolean judgeCircle(String moves) {
        int upAnddown=0;
        int leftAndright=0;

        for(char ch : moves.toCharArray()){
            if(ch=='U')
             upAnddown++;
            else if(ch=='D')
              upAnddown--;
              else if(ch=='R')
               leftAndright++;
               else{
                leftAndright--;
               }
        }
        return leftAndright==0&&upAnddown==0;
        
    }
}