import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
       int j=1;
       int i=0;
       while(j<nums.length){
        if(nums[j]==nums[i]){
            j++;
        }
        else{
            i++;
            nums[i]=nums[j];
        }

       }
       return i+1;
        }
    }