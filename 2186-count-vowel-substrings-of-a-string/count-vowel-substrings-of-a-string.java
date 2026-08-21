class Solution {
    public int countVowelSubstrings(String word) {
       
    char arr[]=word.toCharArray();
    return fun(arr,5)-fun(arr,4);     
    }
    public static int fun(char []arr,int k){
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int len=arr.length;
        int count=0;
        while(r<len){
            if(!isV(arr[r])){
                l=r+1;
                map.clear();
                r++;
                continue;
            }
           map.put(arr[r],map.getOrDefault(arr[r],0)+1);
           
            while(map.size()>k){
                 map.put(arr[l],map.get(arr[l])-1);
                 if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                 }
                 l++;
            }
            count+=(r-l+1);
            r++;

        }
        return count;
    }
    public static boolean isV(char ch){
        if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}