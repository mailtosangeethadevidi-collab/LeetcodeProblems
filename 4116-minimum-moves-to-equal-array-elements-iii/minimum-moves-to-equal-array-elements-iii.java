class Solution {
    public int minMoves(int[] nums) {
       
        int min=0;
        for(int i=0;i<nums.length;i++){
            min=Math.max(nums[i],min);
        }
        int op=0;
        for(int i=0;i<nums.length;i++){
            op+=(min-nums[i]);
        }
        return op;
        
    }
}