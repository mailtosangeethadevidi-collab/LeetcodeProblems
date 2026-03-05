class Solution {
    public int heightChecker(int[] heights) {
      int expec[]=new int[heights.length];
      expec=java.util.Arrays.copyOf(heights,heights.length);
      java.util.Arrays.sort(heights);
      int count=0;
      for(int i=0;i<heights.length;i++){
        if(heights[i]!=expec[i])
          count++;
      }
      return count;
      }
}