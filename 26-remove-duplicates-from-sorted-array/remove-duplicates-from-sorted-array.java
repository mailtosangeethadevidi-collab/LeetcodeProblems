import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
      int num=nums[0];
      int j=1;
      int i=0;
      int n=nums.length;
      while(j<n){
           while(j<n && nums[j]==num){
            j++;
           }
           if(j<n){
            i++;
           nums[i]=nums[j];
           num=nums[j];
           }        
      }
      return i+1;
       }
    }