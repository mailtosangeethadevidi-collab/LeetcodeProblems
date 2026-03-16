class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int m=nums1.length;
       int n=nums2.length;
        int res[]=new int[m+n];
       int i=0;
       int j=0;
      int index=0;
       while(i<m && j<n){
        if(i<m && nums2[j]>nums1[i]){
             res[index++]=nums1[i];
             i++;
        }
        else{
            res[index++]=nums2[j];
            j++;
        }
       }
       while(i<m){
         res[index++]=nums1[i];
         i++;}
        while(j<n){
         res[index++]=nums2[j];
         j++;}
         int len=res.length;
        int mid=len/2; 
      if(len%2==1){
       return (double)(res[mid]);
    }
    return (res[mid]+res[mid-1])/2.0;
    }
}