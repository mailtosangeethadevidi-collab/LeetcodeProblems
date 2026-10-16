class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int ele :  arr){
            pq.offer(ele);
        }
        // System.out.println(pq);

        HashMap<Integer,Integer> mp = new HashMap<>();
        int r=0;
        long prev=Long.MAX_VALUE;

        while(!pq.isEmpty()){
            int ele=pq.poll();
            if(ele==prev){
                mp.put(ele,r);
               
            }
            else{
                r++;
                mp.put(ele,r);
            }
             prev=ele;
            //   System.out.println(ele);
        }
        // System.out.println(mp);
        for(int i=0;i<arr.length;i++){
            arr[i]=mp.get(arr[i]);
        }
        return arr;
        
    }
}