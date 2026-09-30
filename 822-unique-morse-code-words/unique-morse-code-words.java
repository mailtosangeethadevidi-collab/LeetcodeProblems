class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       Set<String> set= new HashSet<>();
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."} ;
        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder();
            for(char ch :words[i].toCharArray()){
                sb.append(arr[ch-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}