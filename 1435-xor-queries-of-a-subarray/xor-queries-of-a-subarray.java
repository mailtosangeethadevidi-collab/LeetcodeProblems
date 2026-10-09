class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int pre[]=new int[arr.length];
        pre[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]^arr[i];
        }
        System.out.println(Arrays.toString(pre));

        int res[]=new int[queries.length];
        int i=0;
        for(int row[]:queries){
            int l=row[0];
            int r=row[1];
            if(l==0)
             res[i++]=pre[r];
             else
             res[i++]=pre[r]^pre[l-1];
        }
        return res;
        
    }
}