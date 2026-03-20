class Solution {
    public int[] shortestToChar(String s, char c) {
        int temp[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int minlen=Integer.MAX_VALUE;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==c)
                minlen=Math.min(minlen,Math.abs(j-i));
            }
            temp[i]=minlen;
        }
       return temp;
    }

}