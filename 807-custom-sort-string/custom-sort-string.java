class Solution {
    public String customSortString(String order, String s) {
     HashMap<Character,Integer> map = new HashMap<>();
    int j=0;
     for(char ch :order.toCharArray()){
        map.put(ch,j);
        j++;
     }
     List<Character> al = new ArrayList<>();
     for(char ch : s.toCharArray()){
        al.add(ch);
     }
      Collections.sort(al,(a,b)->{
        int indexOfa=map.getOrDefault(a,-1);
        int indexOfb = map.getOrDefault(b,-1);
        return indexOfa-indexOfb;
      });
      StringBuilder sb = new StringBuilder();
      for(Character ch :al){
        sb.append(ch);
      }
      return sb.toString();
    }
}