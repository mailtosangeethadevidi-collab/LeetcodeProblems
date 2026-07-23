class Solution {
    public String reverseWords(String s) {
        
        s=s.strip();
        String arr[]=s.split("\\s+");
       
        StringBuilder sb = new StringBuilder();
        for(int j =arr.length-1;j>=0;j--){
            if(!arr[j].equals(" ")){
                sb.append(arr[j]);
            }
            if(j!=0){
               sb.append(" ");
            }
        }
        return sb.toString();
    }
}