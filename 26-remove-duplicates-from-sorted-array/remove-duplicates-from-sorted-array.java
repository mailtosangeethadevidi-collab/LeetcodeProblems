import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
      int num=nums[0];
      int j=1;
      int i=0;
      while(j<nums.length){
          
           while(j<nums.length && nums[j]==num){
            j++;
           }
           if(j<=nums.length-1){
            i++;
           nums[i]=nums[j];
           num=nums[j];
           }
            
          
      }
      return i+1;
       }
    }