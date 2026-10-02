class Solution {
    public int findClosestNumber(int[] nums) {
        int mindis=Integer.MAX_VALUE;
        int maxele=0;
        for(int i :nums){
            if(Math.abs(i)<=mindis){
                if(Math.abs(i)==mindis){
                    maxele=Math.max(maxele,i);
                }else{
                mindis=Math.abs(i);
                maxele=i;
                }
                System.out.println(maxele);
                
            }

        }
        return maxele;
    }
}