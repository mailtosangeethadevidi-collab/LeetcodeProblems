import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1,num=nums[0];
        while(j<nums.length){
            while(j<nums.length&&nums[j]==num){
                j++;
            }
            if(j<nums.length){
                i++;
                nums[i]=nums[j];
                num=nums[j];
            }
        }
        return i+1;
        }
    }