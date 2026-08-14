class Solution {
    public boolean queryString(String s, int n) {
        while(n>=1){
            String str=Integer.toBinaryString(n);
            if(!s.contains(str)){
              return false;
            }
              n--;
        }
        return true;
    }
}