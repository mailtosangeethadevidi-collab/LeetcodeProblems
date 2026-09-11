class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        int temp=n;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(temp!=0){
            int num=temp%10;
            map.put(num,map.getOrDefault(num,0)+1);
            temp/=10;
        }
        while(n!=0){
             int num=n%10;
            sum+=(num)*map.get(num);
            map.put(num,0);
            n/=10;
            
        }
        return sum;
        
     }
}