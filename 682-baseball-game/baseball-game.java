import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
         int n1=0,n2=0;
      for(int i=0;i<operations.length;i++){
        String str=operations[i];
        if(str.equals("C")){
            if(!st.isEmpty())
            st.pop();
        }
        else if(str.equals("D")){
           st.push(2*st.peek());
        }
        else if(str.equals("+")){
            if(!st.isEmpty())
             n1=st.pop();
            if(!st.isEmpty()){
             n2=st.peek(); 
             st.push(n1);
            st.push(n1+n2); 
            }
        }
        else{
           int num=Integer.parseInt(str);
           st.push(num);
        }
      }
      int sum=0;
     while(!st.isEmpty()){
        sum+=st.pop();
     }
     return sum;
    }
}