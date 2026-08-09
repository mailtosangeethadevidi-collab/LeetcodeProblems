class Solution {
    public int maximumLengthSubstring(String s) {
       java.util.HashMap<Character,Integer> map =new HashMap<>();
       char arr[]=s.toCharArray();
       int r=0;
       int l=0;
       int n =arr.length;
       int maxlen=0;
       while(r<n){
  
        map.put(arr[r],map.getOrDefault(arr[r],0)+1);
        int count=map.get(arr[r]);
        if(count>2){
            maxlen=Math.max(maxlen,r-l);
        while(count>2){
           
            map.put(arr[l],map.get(arr[l])-1);
            count=map.get(arr[r]);
            l++;
        }
      
        }
          r++;
       }
       maxlen=Math.max(maxlen,r-l);
       return maxlen;
    }
}