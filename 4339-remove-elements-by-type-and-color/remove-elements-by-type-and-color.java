class Solution {
    public boolean canRemoveAll(int[] types, int[] colors, int[] groupSize) {
       
        Stack<List<Integer>> st = new Stack<>();
        
       HashMap<List<Integer>,Integer> map=new HashMap<>(); 
       
        for(int i=0;i<types.length;i++){
            ArrayList<Integer> al=new ArrayList<>();
             al.add(types[i]);
             al.add(colors[i]);
            if(st.isEmpty()){
            
                st.push(al);
                
            }

           else if(!st.peek().equals(al)){
               
                st.push(al);
                
              
            }
            map.put(al,map.getOrDefault(al,0)+1);
            
            
            if(st.peek().equals(al)&&map.get(al)==groupSize[types[i]]){
              st.pop();
              map.put(al,0);
            }
           
        }
         
           return st.isEmpty();
    }
}