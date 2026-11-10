class Solution {
    public int countSuffix(int[] nums, int[] target) {
       int count=0;
       int index=0;
       int n=nums.length;
       while(index<n && nums[index]==target[index]){
        index++;
       }
       index--;
       
       index=Math.max(0,index);
       HashMap<Integer,Integer> map = new HashMap<>();

        int prev=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(target[i]<prev) {
              break;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            map.put(target[i],map.getOrDefault(target[i],0)-1);

            if(map.get(nums[i])==0)
              map.remove(nums[i]);
            if(map.containsKey(target[i])&&map.get(target[i])==0)
              map.remove(target[i]);

            if(map.size()==0 && i-1<=index )
              count++;
            
            prev=target[i];
        }
      return count;

        
        
    }
}