class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int l=0;
        int r=0;
        int maxsum=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int len=nums.length;
        while(r<len){
           sum+=nums[r];
           if(map.containsKey(nums[r])){
            int newIndex=Math.max(map.get(nums[r])+1,l);
            if(newIndex>l){
                for(int i=l;i<newIndex;i++){
                    sum-=nums[i];
                }
            }
             l=Math.max(map.get(nums[r])+1,l);
           }
            
            map.put(nums[r],r);
           
            maxsum=Math.max(maxsum,sum);
             r++;
        }
        return maxsum;
    }
}