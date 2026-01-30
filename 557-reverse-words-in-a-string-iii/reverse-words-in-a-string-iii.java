class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
           StringBuilder sb1 = new StringBuilder(arr[i]);
            int j=0;
            int k=sb1.length()-1;
            while(j<k){
                char temp=sb1.charAt(j);
                sb1.setCharAt(j,sb1.charAt(k));
                sb1.setCharAt(k,temp);
                j++;
                k--;
            }
           if(i!=arr.length-1){
            sb.append(sb1.toString()+" ");
           }
           else{
            sb.append(sb1.toString());
           }
           
        }
       return sb.toString(); 
    }
}