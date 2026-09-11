class Solution {
    public int findShortestSubArray(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        HashMap<Integer,Integer> map =new HashMap<>();
        HashMap<Integer,Integer> left =new HashMap<>();
        HashMap<Integer,Integer> right=new HashMap<>();
        int maxfreq=0;
        for(int i=0;i<nums.length;i++){
            if(!left.containsKey(nums[i])){
                left.put(nums[i],i);
            }
            right.put(nums[i],i);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            maxfreq=Math.max(maxfreq,map.get(nums[i]));
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==maxfreq){
                  min= Math.min(min,right.get(nums[i])-left.get(nums[i])+1);
                  map.put(nums[i],map.get(nums[i])-1);
            }
        }
        return min;
       
    }
}