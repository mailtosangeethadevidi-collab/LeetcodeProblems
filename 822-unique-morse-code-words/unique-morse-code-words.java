class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       Set<String> set= new HashSet<>();
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."} ;
        for(int i=0;i<words.length;i++){
            String str="";
            for(char ch :words[i].toCharArray()){
               str+=(arr[ch-'a']);
            }
            set.add(str);
        }
        return set.size();
    }
}