import java.util.Stack;
class Solution {
    public String makeGood(String s) {
     Stack <Character> st=new Stack<>();
     st.push(s.charAt(0));
     for(int i=1;i<s.length();i++){
        char ch = s.charAt(i);
        char top='1';
        if(!st.isEmpty())
           top=st.peek();
        if(top==Character.toUpperCase(ch) && Character.isLowerCase(ch)){
            st.pop();
        }
        else if(top==Character.toLowerCase(ch) && Character.isUpperCase(ch)){
            st.pop();
        }
        else
         st.push(ch);
     }
     StringBuilder sb = new StringBuilder();
     while(!st.isEmpty()){
        sb.append(st.pop());
     }
     return sb.reverse().toString();
    }
}