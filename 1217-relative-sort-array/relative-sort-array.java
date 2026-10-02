class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int freq[]=new int[10001];
        for(int i :arr1){
            freq[i]++;
        }
        int index=0;
        for(int i=0;i<arr2.length;i++){
            int fre=freq[arr2[i]];
            while(fre--!=0){
                arr1[index++]=arr2[i];
            }
           freq[arr2[i]]=0;
        }
        for(int i =0;i<freq.length;i++){
            while(freq[i]--!=0){
                arr1[index++]=i;
            }
        }
        return arr1;
    }
}