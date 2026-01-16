class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        int n=-1;
        int index=0;
        for(int i=0;i<nums1.length;i++){
            int flag=0;
            int j=0;
            for(j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    flag=1;
                    break;
                }
            }
            int f=0;
            for(int k=j;k<nums2.length;k++){
                        if(nums2[k]>nums2[j]){
                            n=nums2[k];
                            f=1;
                            break;
                        }
            }
            if(f==1){
                ans[index++]=n;
            }
            else{
                ans[index++]=-1;
            }

            }
            return ans;
    }
}