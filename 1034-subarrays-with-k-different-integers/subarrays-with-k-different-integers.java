class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return fun(nums,k)-fun(nums,k-1);
    }
    public static int fun(int [] nums,int k){
      
        int l=0;
        int r=0;
        int len=nums.length;
        int freq[]= new int[len+1];
        int count=0;
        int diff=0;
        while(r<len){
          

           if(freq[nums[r]]==0){
            diff++;
           }

            freq[nums[r]]+=1;

            while(diff>k){

               freq[nums[l]]--;

                if(freq[nums[l]]== 0){
                   diff--;
                }
                l++;

            }
            count+=(r-l+1);
            r++;

        }
        return count;
    }
}