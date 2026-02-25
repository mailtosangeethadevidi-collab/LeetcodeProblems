class Solution {
    public String capitalizeTitle(String title) {
     String t=title.toLowerCase();
     String[] arr=t.split(" ");
     StringBuilder sb1=new StringBuilder();
     for(int i=0;i<arr.length;i++){
     StringBuilder sb = new StringBuilder(arr[i]);
        if(sb.length()>2){
          sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
          sb1.append(sb);
          if(i!=arr.length-1)
            sb1.append(" ");
        }
        else {
             
             sb.setCharAt(0,Character.toLowerCase(sb.charAt(0)));
             if(sb.length()==2){
             sb.setCharAt(0,Character.toLowerCase(sb.charAt(0)));
             sb.setCharAt(1,Character.toLowerCase(sb.charAt(1)));
             }
             sb1.append(sb);
              if(i!=arr.length-1)
            sb1.append(" ");
        }
    }
    return sb1.toString();
     }
    }
