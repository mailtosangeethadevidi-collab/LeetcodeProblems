import java.util.Stack;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!='#')
            st.push(ch);
            else{
                if(!st.isEmpty())
                st.pop();
            }
        }
      StringBuilder sb1 = new StringBuilder();
       while(!st.isEmpty()){
           sb1.append(st.pop());
       }
        st.clear();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch!='#')
            st.push(ch);
            else{
                if(!st.isEmpty())
                st.pop();
            }
        }
        StringBuilder sb2 = new StringBuilder();
       while(!st.isEmpty()){
           sb2.append(st.pop());
       }
       
        
        return (sb1.toString()).equals(sb2.toString());  
    }
}