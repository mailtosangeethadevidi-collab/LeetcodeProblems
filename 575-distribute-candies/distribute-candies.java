class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int limit=candyType.length/2;
        for(int candy:candyType){
            map.put(candy,1);
            if(map.size()>=limit){
                return limit;
            }
        }
        return map.size();
        
    }
}