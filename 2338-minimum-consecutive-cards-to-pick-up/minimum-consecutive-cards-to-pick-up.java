class Solution {
    public int minimumCardPickup(int[] cards) {

        HashMap<Integer,Integer> map = new HashMap<>();
      
        int r=0;
        int len=cards.length;
        int min=Integer.MAX_VALUE;
        while(r<len){
            if(map.containsKey(cards[r])){
                min=Math.min(min,r-map.get(cards[r])+1);
            }
            map.put(cards[r],r);
            r++;
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}