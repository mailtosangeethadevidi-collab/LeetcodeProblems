class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return fun(nums,k)-fun(nums,k-1);
    }
    public static int fun(int [] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int l=0;
        int r=0;
        int len=nums.length;
        int count=0;
        while(r<len){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);

            while(map.size()>k){

                int c=map.get(nums[l]);
                map.put(nums[l],c-1);

                if( c-1 == 0){
                    map.remove(nums[l]);
                }
                l++;

            }
            count+=(r-l+1);
            r++;

        }
        return count;
    }
}