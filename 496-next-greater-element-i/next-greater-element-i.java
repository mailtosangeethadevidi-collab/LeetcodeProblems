class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
        int j=0;
        for(j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                break;
            }
        }
        int flag=0;
        for(int k=j;k<nums2.length;k++){
            if(nums2[k]>nums2[j]){
                ans[i]=nums2[k];
                flag=1;
                break;
            }
        }
        if(flag==0){
            ans[i]=-1;
        }
    }
     return ans;       
    }
}