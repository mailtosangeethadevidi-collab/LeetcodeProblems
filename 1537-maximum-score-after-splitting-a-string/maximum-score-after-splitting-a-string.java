class Solution {
    public int maxScore(String s) {
        int rs=0;
        int ls=0;
        char arr[]=s.toCharArray();
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1')
            rs+=1;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]=='0')
              ls+=1;
            else if(arr[i]=='1')
              rs-=1;
            maxsum=Math.max(maxsum,ls+rs);
        }
        return maxsum;
    }
}