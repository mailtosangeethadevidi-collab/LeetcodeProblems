class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;
        int r=0;
        int n =arr.length;
        int sum=0;
        int count=0;
        while(r<n){
            sum+=arr[r];
            if(r-l+1==k){
                if(sum/k>=threshold){
                    count++;
                }
                sum-=arr[l];
                l++;
            }
            r++;
        }
        return count;
    }
}