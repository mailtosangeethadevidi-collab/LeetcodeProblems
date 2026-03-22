class Solution {
    public boolean uniformArray(int[] nums1) {
    //int n=nums1.length;
    int min=Integer.MAX_VALUE;
    int even=0;
        for(int i=0;i<nums1.length;i++){
            min=Math.min(min,nums1[i]);
            if(nums1[i]%2==0)
              even++;
        }
        if(min%2!=0 || even==nums1.length){
            return true;
        }
        return false;
    }
}