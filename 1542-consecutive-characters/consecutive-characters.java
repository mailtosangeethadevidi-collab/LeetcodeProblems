class Solution {
    public int maxPower(String s) {
      char arr[]=s.toCharArray();
        int count=1;
        int maxcount=1;
        for(int i=0;i<arr.length-1;){
            while(i<arr.length-1&&arr[i]==arr[i+1]){
                count++;
                i++;
            }
          maxcount=Math.max(count,maxcount);
          count=1;
          i++;
        }
        return maxcount;
    }
}