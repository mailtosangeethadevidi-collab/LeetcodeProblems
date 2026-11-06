class Solution {
    public String removeOuterParentheses(String s) {
        int open=1;
        int close=0;
        StringBuilder sb = new StringBuilder();
        int len=s.length();
        for(int i=1;i<len;){
            char ch = s.charAt(i);
            if(ch=='(')
              open++;
            if(ch==')')
              close++;
            if(open==close){
                open=1;
                close=0;
                i+=2;
            }
            
            else{
                sb.append(ch);
                i++;
            }
        } 
        return sb.toString();
    }
}