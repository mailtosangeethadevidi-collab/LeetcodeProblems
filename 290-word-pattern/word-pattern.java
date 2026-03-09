class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[]=s.split(" ");
        HashMap<Character,String> map1= new HashMap<>();
         HashMap<String,Character> map2= new HashMap<>();
         if(pattern.length()!=str.length)
           return false;
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String st=str[i];
            if(map1.containsKey(ch)){
                if(!str[i].equals(map1.get(ch))){
                    return false;
                }
            }
            if(map2.containsKey(st)){
                if(ch!=(map2.get(st))){
                    return false;
                }
            }
            map2.putIfAbsent(st,ch);
            map1.putIfAbsent(ch,str[i]);
        }
        return true;
    }
}