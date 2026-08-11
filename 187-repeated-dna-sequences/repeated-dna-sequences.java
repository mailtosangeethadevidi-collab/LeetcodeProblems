class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
       List<String> list = new ArrayList<>();
      
       int len=s.length();
       if(len<10){
        return list;
       }
      HashMap<String,Integer> map = new HashMap<>();
      int l=0;
      int r=9;
      
      while(r<len){
        String str=s.substring(l,r+1);
        if(map.getOrDefault(str,0)==1){
            list.add(str);
        }
        map.put(str,map.getOrDefault(str,0)+1);
        l++;
        r++;
      }
      return list;
    }
}