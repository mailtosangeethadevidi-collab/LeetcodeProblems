class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int l=0;
        int r=0;
        char arr[]=s.toCharArray();
        int n =arr.length;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<n){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
           while(map.size()==3&&map.get(arr[l])>=1){

                count+=(n-r);
                int c=map.get(arr[l]);
                map.put(arr[l],c-1);
                if(c-1 == 0)
                 map.remove(arr[l]);

                l++;
            }
            r++;
        }
        return count;
    }
}