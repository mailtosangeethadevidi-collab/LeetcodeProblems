import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;
        int l=0;
        int r=n-1;
        int res[]=new int[n];
        n-=1;
        while(l<r){
            int left=nums[l]*nums[l];
            int right=nums[r]*nums[r];
            if(left>=right){
                res[n--]=left;
                l++;
            }
            else{
                res[n--]=right;
                r--;
            }
        }

        res[n]=nums[l]*nums[l];
        return res;
   }
}