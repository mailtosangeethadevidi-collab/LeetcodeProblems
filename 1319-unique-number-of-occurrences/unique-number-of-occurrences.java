class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> set =new HashSet<>();
        //boolean hasDup=false;
        for(Integer value:map.values()){
            if(!set.add(value)){
                //hasDup=true;
                return false;
            }
        }
         return true;
    }
}