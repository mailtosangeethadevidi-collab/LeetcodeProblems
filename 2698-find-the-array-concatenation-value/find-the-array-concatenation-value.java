class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int first=0;
        int last=nums.length-1;
        long  value=0L;
        while(first<=last){
            if(first==last){
                value+=Integer.parseInt(String.valueOf(nums[last]));
            }
            else{
             value=value+Integer.parseInt(String.valueOf(nums[first])+String.valueOf(nums[last]));
            }
            first++;
            last--;
        }
        return value;
    }
}