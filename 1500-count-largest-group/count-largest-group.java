class Solution {
    public int countLargestGroup(int n) {
    TreeMap<Integer,Integer> map = new TreeMap<>();
    int max=0;
        for(int i=1;i<=n;i++){
            int digSum=getSum(i);
            map.put(digSum,map.getOrDefault(digSum,0)+1);
            max=Math.max(max,map.get(digSum));
        }
            

            int count=0;
    for(int key : map.keySet()){
        if(map.get(key)==max)
          count++;
    }
       
     return count;   
    }
    public static int getSum(int num){
        int sum=0;
        while(num!=0){
            sum+=(num%10);
            num/=10;
        }
        return sum;
    }
}