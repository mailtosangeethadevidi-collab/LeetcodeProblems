import java.util.ArrayList;
class Solution {
    public void duplicateZeros(int[] arr) {
        //lenght=arr lenght+num of zeroes
     int newlenindex=arr.length-1;
     for(int i=0;i<arr.length;i++){
        if(arr[i]==0)
          newlenindex++;
     }
     int arrlastindex=arr.length-1;
     while(arrlastindex>=0){
        if(newlenindex<arr.length){
            arr[newlenindex]=arr[arrlastindex];
        }
        if(arr[arrlastindex]==0){
            newlenindex--;
            if(newlenindex<arr.length){
                arr[newlenindex]=0;
            }
        }
        newlenindex--;
        arrlastindex--;
     }
    }
}