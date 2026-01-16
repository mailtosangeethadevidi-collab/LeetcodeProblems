import java.util.Stack;
class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!st.isEmpty()){
                 if((ch=='B' && st.peek()=='A') || (ch=='D' && st.peek()=='C'))
                    st.pop();
                
                  else
                    st.push(ch);
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.length();
    }
}