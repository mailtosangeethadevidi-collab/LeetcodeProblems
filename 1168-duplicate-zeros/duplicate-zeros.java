import java.util.ArrayList;
class Solution {
    public void duplicateZeros(int[] arr) {
       ArrayList<Integer> l = new ArrayList<Integer>(); 
       for(int i=0;i<arr.length;i++){
         if(arr[i]==0){
            l.add(0);
            l.add(0);
         }
         else
         l.add(arr[i]);
       }
       for(int i=0;i<arr.length;i++){
        arr[i]=l.get(i);
       }
    }
}