class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int first=arr.length/20;
        int last=(arr.length-1)-first;
        double mean=0.0; 
        int count=0;
        for(int i=first;i<=last;i++){
            mean+=arr[i];
            count++;
        }
        return mean/count;
    }
}