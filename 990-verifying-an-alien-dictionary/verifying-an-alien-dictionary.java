class Solution {
    public boolean isAlienSorted(String[] words, String order) {
       HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<26;i++){
           map.put(order.charAt(i),i);
        }
        System.out.println(map);

        for(int i=0;i<words.length-1;i++){
          String one=words[i];
          String two=words[i+1];
           int onelen=one.length();
            int twolen=two.length();
          if(one.equals(two)){
            continue;
          }
          else{
            int oneindex=map.get(one.charAt(0));
            int twoindex=map.get(two.charAt(0));
           
            if(oneindex<twoindex)
             continue;
            
            if(onelen>twolen && one.substring(0,twolen).equals(two)){
                return false;
            }
            else{
                int len=Math.min(onelen,twolen);
                for(int j=0;j<len;j++){
                      oneindex=map.get(one.charAt(j));
                      twoindex=map.get(two.charAt(j));
                    if(oneindex>twoindex){
                        return false;
                    }
                }
            }
          }
         

          

        }
        return true;
    }
}