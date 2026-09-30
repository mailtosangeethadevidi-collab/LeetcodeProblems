class Solution {
    public List<String> commonChars(String[] words) {
      List<String> l= new ArrayList<>();
    int []map = new int [26];
     
        for(char ch:words[0].toCharArray()){
           map[ch-'a']++;
        }
     
      for(int i=1;i<words.length;i++){
          int[] map2 = new int[26];
        for(char ch : words[i].toCharArray()){
            map2[ch-'a']++;
        }
       
        for(char ch :words[0].toCharArray()){
            if(map[ch-'a']!=0 && map2[ch-'a']!=0){
                map[ch-'a']=Math.min( map[ch-'a'],map2[ch-'a']);
            }
            
            else{
              map[ch-'a']=0;
            }

        }
      }
      for(int i=0;i<26;i++){
        int freq=map[i];
            while(freq--!=0){
               l.add((char)(i+97)+"");
            }
      }
      return l;

     }
}