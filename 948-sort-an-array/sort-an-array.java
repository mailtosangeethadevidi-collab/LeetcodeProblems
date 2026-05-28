class Solution {
    public int[] sortArray(int[] arr) {
        mergesort(arr,0,arr.length-1);
        return arr;
    }
    public static void mergesort(int []arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int []arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int index=0;
        int temp[]=new int[high-low+1];
        while(left<=mid &&right<=high){
            if(arr[left]<=arr[right])
            temp[index++]=arr[left++];
            else
            temp[index++]=arr[right++];
        }
        while(left<=mid){
            temp[index++]=arr[left++];
        }
        while(right<=high){
            temp[index++]=arr[right++];
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
}