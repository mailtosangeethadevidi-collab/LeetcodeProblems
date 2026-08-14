class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int l=0;
        int r=0;
        int max1=1;
        int n =arr.length;
        while(r<n-1){
            if(r%2==0&&arr[r]<arr[r+1]){
                r++;
            }
            else if(r%2!=0&&arr[r]>arr[r+1]){
                r++;
            }
            else{
                max1=Math.max(r-l+1,max1);
                l=r+1;
                r++;
            }
           
        }
        max1=Math.max(max1,r-l+1);

        l=0;
        r=0;
        int max2=1;
        while(r<n-1){
            if(r%2!=0&&arr[r]<arr[r+1]){
                r++;
            }
            else if(r%2==0&&arr[r]>arr[r+1]){
                r++;
            }
            else{
                max2=Math.max(r-l+1,max2);
                l=r+1;
                r++;
            }
        }
        max2=Math.max(max2,r-l+1);
        return Math.max(max1,max2);
        
    }
}