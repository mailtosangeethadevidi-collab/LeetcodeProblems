class Solution {
    public int firstUniqueFreq(int[] nums) {
       HashMap <Integer,Integer> freq = new HashMap();
        HashMap <Integer,Integer> freqC = new HashMap();
       for(int i=0;i<nums.length;i++){
 freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
       } 
    
    for(int i:freq.values()){
        freqC.put(i,freqC.getOrDefault(i,0)+1);
    }
    for(int i:nums){
        int f=freq.get(i);
        if(freqC.get(f)==1)
          return i;
    }
    return -1;
}
}