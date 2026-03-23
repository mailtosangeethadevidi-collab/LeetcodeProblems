class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s);
       int i=0,j=0,count=0;
       int gl=g.length,sl=s.length;
       while(i<gl && j<sl){
        if(s[j]>=g[i]){
            count++;
            i++;
            j++;
        }
        else if(s[j]<g[i]){
            j++;
        }
       }
       return count;
    }
}