class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int min=Integer.MAX_VALUE;
        
        int len = arr.length;

        if(len==1){
            return 0;
        }
        
        int l=0;
        while(l<len-1 && arr[l]<=arr[l+1]){
            l++;
        }

        if(l==len-1){
            return 0;
        }

        int r=len-1;

        while(r>1 && arr[r-1]<=arr[r]){
            r--;
        }

        min=Math.min(r, len-1-l);

        int i=0,j=r;
        while(i<=l && j<len){
            if(arr[i]<=arr[j]){
                min=Math.min(min,j-i-1);
                i++;
            }
            else{
                j++;
            }
        }
       
        return min;

    }
}