class Solution {
    public List<String> commonChars(String[] words) {
      List<String> l= new ArrayList<>();
      HashMap<Character,Integer> map = new HashMap<>();
     
        for(char ch:words[0].toCharArray()){
         
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
     
      
   
      for(int i=1;i<words.length;i++){
          HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch :words[i].toCharArray()){
             map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        Iterator<Character> it= map.keySet().iterator();
        while(it.hasNext()){
            char key = it.next();
            
            if(map2.containsKey(key)){
                int freq1=map.get(key);
                int freq2=map2.get(key);
                map.put(key,Math.min(freq1,freq2));
                
            }
            else{
                it.remove();
            }

        }
      }
      for(char key :map.keySet()){
        int freq=map.get(key);
        while(freq!=0){
            l.add(key+"");
            freq--;
        }
      }
      return l;

     }
}