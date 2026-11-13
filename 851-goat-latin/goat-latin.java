class Solution {
    public String toGoatLatin(String sentence) {
        String arr[]=sentence.split(" ");
        StringBuilder a = new StringBuilder();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            char first=sb.charAt(0);
            if("aeiouAEIOU".indexOf(first)==-1){
                sb.deleteCharAt(0);
                sb.append(first);
            }
           
            a.append("a");
            sb.append("ma").append(a);
           if(i<arr.length-1)
             res.append(sb.toString()+" ");
             else
               res.append(sb.toString());
           

        }
      
        return res.toString();
    }
}