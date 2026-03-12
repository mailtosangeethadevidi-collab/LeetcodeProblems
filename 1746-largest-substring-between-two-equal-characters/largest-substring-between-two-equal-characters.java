class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        HashMap<Character,Integer> map= new HashMap<>();
        int maxlen=-1;
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(map.containsKey(ch)){
             maxlen=Math.max(maxlen,(i-map.get(ch)-1));
           }
          map.putIfAbsent(ch,i);
        }
       return maxlen;
    }
}