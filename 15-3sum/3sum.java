import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length==3){

        }
      Arrays.sort(nums);
      int b=0;
      int c=0;
      List<List<Integer>> l= new ArrayList<>();
      for(int a=0;a<nums.length;a++){
         if(a!=0 && nums[a]==nums[a-1])
           continue;
         b=a+1;
         c=nums.length-1;
         while(b<c){
            int sum=nums[a]+nums[b]+nums[c];
            if(sum<0){
                b++;
            }
           else if(sum>0){
                c--;
            }
           else if(sum==0){
              List<Integer> l1 = new ArrayList<>();
              l1.add(nums[a]);
              l1.add(nums[b]);
              l1.add(nums[c]);
              l.add(l1);
              b++;
              c--;
              while(b<c &&nums[b]==nums[b-1]){
                b++;
              }
              while(b<c && nums[c]==nums[c+1]){
                c--;
              }

              
            }
         }
      }
      return l;
    }
}