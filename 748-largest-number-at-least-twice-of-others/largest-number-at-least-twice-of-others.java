class Solution {
    public int dominantIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int flag=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]>=nums[j]*2)
                      flag=1;
                    else{
                        flag=0;
                        break;
                    }
                }
            }
            if(flag==1){
                return i;
            }
        }
        return -1;
    }
}