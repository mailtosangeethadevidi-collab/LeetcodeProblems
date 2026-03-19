class Solution {
    public String frequencySort(String s) {
       StringBuilder sb = new StringBuilder();
    HashMap<Character,Integer> map = new HashMap<>();
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
       } 
       List<Map.Entry<Character,Integer>> list= new ArrayList<>(map.entrySet());
       Collections.sort(list,(a,b)->b.getValue()-a.getValue());
  for(Map.Entry<Character,Integer> entry:list){
    for(int i=0;i<entry.getValue();i++)
    sb.append(entry.getKey());
  }
  return sb.toString();
    }
}