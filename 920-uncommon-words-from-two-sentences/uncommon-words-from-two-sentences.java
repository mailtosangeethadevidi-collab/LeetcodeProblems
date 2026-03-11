class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
    HashMap<String,Integer> map1 = new HashMap<>();
    HashMap<String,Integer> map2 = new HashMap<>();
    String []one=s1.split(" ");
    String []two=s2.split(" ");
    String res[]=new String[50];
    if(one.length==0)
      return two;
    if(two.length==0)
      return one;
    for(int i=0;i<one.length;i++){
        map1.put(one[i],map1.getOrDefault(one[i],0)+1);
    }
    for(int i=0;i<two.length;i++){
        map2.put(two[i],map2.getOrDefault(two[i],0)+1);
    }
    int index=0;
    for(int i=0;i<one.length;i++){
        if(map1.get(one[i])==1&&map2.get(one[i])==null)
          res[index++]=one[i];
    }
    for(int i=0;i<two.length;i++){
        if(map2.get(two[i])==1&&map1.get(two[i])==null)
          res[index++]=two[i];
    }
    String re[]=new String[index];
    re=Arrays.copyOf(res,index);
    return re;
    }
}