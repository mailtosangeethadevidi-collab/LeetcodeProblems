import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
       for(int j :nums){
        if(j!=nums[i]){
            nums[i+1]=j;
            i++;
        }
       }
       return i+1;
    }
}