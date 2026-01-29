class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0,tsum=t.charAt(0);
        for(int i=0;i<s.length();i++){
          sum+=s.charAt(i);
          tsum+=t.charAt(i+1);
        }
        return (char)(tsum-sum);
    }
}