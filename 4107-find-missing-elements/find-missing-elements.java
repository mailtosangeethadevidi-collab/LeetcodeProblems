import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l= new ArrayList<>();
        Arrays.sort(nums);
        int small=nums[0];
        int n =nums.length;
        small++;
        for(int i=1;i<n-1;i++){
            while(nums[i]!=small){
                l.add(small);
                small++;
            }
            small++;
        }
       
        while(small<nums[n-1]){
            l.add(small);
            small++;
        }
        return l;
    }
    }