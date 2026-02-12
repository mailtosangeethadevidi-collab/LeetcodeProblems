class Solution {
    public int[] replaceElements(int[] arr) {
        int i=0;
        for( i=0;i<arr.length;i++){
            if(i!=arr.length-1){
            int max=Integer.MIN_VALUE;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max)
                  max=arr[j];
            }
            arr[i]=max;
            }
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}