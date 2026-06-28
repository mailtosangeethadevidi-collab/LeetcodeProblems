class Solution {
    public char repeatedCharacter(String s) {
        List<Character> l = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
               if(l.contains(ch)){
                return ch;
               }
          l.add(ch);
        }
        return 'a';
    }
}