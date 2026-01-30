class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
           StringBuilder sb1 = new StringBuilder(arr[i]);
            
           if(i!=arr.length-1){
            sb.append(sb1.reverse()+" ");
           }
           else{
            sb.append(sb1.reverse());
           }
           
        }
       return sb.toString(); 
    }
}