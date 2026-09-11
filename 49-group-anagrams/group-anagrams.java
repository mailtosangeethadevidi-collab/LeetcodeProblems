class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();
        for(String str : strs){
            char arr[]=str.toCharArray();
            Arrays.sort(arr);
            String word=new String(arr);
            if(map.containsKey(word)){
               List<String> l = map.get(word);
               l.add(str);
               map.put(word,l);
            }
            else{
                List<String> l=new ArrayList<>();
                l.add(str);
                map.put(word,l);
            }
        }
        List<List<String>> l = new ArrayList<>();
      for(Map.Entry<String,List<String>> entry:map.entrySet()){
        l.add(entry.getValue());
      }
      return l;
    }
}