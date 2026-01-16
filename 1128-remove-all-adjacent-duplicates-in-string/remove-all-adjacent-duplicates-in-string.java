import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st=new Stack<>();
        st.push(s.charAt(0));
         for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty()){
                if(st.peek()==ch)
                   st.pop();
                    else{
                  st.push(ch);
            }
            }
            else{
            st.push(ch);
            }
         }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}