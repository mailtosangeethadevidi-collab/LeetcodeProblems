class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        for(int i=1;i<=2000;i++){
            if(!isThere(arr,i)){
              k--;
            }
            if(i>=arr[arr.length-1]){
                return arr[arr.length-1]+k;
            }
            if(k==0){
                return i;
            }
        }
        return 0;
    }
    public static boolean isThere(int[] arr,int ele){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(high+low)/2;

            if(arr[mid]==ele){
                return true;
            }
            else if(arr[mid]>ele){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}