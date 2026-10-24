class Solution {
    public List<String> removeAnagrams(String[] words) {
     
      List<String> res=new ArrayList<>();
      int l=0;
      int r=1;
      res.add(words[0]);
      while(r<words.length){
        String str1=res.get(res.size()-1);
        String str2=words[r];
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(!(new String(arr1)).equals(new String(arr2))){
            
            
            res.add(words[r]);
           
        }
      
        r++;

      }
       
      return res;
        
    }
}