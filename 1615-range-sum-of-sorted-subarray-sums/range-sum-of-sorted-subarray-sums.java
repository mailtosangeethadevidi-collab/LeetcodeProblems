class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        long p[]=new long[n*(n+1)/2];
        int index=0;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                p[index++]=sum;
            }
        } 
         Arrays.sort(p);
        for(int i=1;i<p.length;i++){
           p[i]=p[i-1]+p[i];
        }
       System.out.println(Arrays.toString(p));
       if(left==1){
        return (int)(p[right-1]%1000000007);
       }
     
        right-=1;
        return (int)((p[right]-p[left-2])%1000000007);
    }
}