class Solution {
    public int maxDistance(int[] colors) {
        int i=0,j=colors.length-1;
        int max1=0;
        while(j>=0){
            if(colors[i]!=colors[j]){
              max1= Math.abs(i-j);
              break;
            }
            j--;
        }
        j=0;
        i=colors.length-1;
        while(j<colors.length){
            if(colors[i]!=colors[j]){
         return Math.max(max1,Math.abs(i-j));
            }
            j++;
        }
        return 0;
    }
}