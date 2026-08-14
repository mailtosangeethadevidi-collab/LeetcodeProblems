class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int max=0;
        int len=s.length();
        while(r<len){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.get(ch)>2){
                char left=s.charAt(l);
                map.put(left,map.get(left)-1);
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}