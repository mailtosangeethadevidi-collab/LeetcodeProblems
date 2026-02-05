class Solution {
    public boolean checkIfExist(int[] arr) {
        java.util.Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            double num=arr[i]/2.0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>num){
                    break;
                }
                else if((i!=j)&&arr[j]==num){
                    return true;
                }
            }
        }
        return false;
    }
}