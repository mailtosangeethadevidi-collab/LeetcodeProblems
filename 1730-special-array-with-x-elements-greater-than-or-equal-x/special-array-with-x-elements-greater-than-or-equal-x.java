class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<=nums.length;i++){
            int low=0;
            int high=nums.length-1;
            int ans=-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]>=i){
                    ans=mid;
                    high=mid-1;
                }
                else
                  low=mid+1;
            }
            if(nums.length-ans==i){
                return i;
            }

        }
        return -1;
    }
    
}