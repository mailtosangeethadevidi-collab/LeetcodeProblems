class Solution {
    public int totalFruit(int[] fruits) {
        java.util.HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        int r=0;
        int l=0;
        int n =fruits.length;
        int distinct=0;
        while(r<n){
           
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
           
                while(map.size()>=3){

                    map.put(fruits[l],map.get(fruits[l])-1);
                    if(map.get(fruits[l])==0)
                      map.remove(fruits[l]);
                    l++;
                }


            
            count=Math.max(count,r-l+1);
            r++;
        }
        
        return count;
        
    }
}