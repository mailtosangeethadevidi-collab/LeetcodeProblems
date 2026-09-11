class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        int temp=n;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(temp!=0){
            map.put(temp%10,map.getOrDefault(temp%10,0)+1);
            temp/=10;
        }
        while(n!=0){

            sum+=(n%10)*map.get(n%10);
            map.put(n%10,0);
            n/=10;
            
        }
        return sum;
        
     }
}