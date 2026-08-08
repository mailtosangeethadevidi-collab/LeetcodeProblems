import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> m = new HashMap<>();
        int left=0;
        int right =0;
        while(right<nums.length){
            while(right<nums.length&&right-left <=k){
            if(m.containsKey(nums[right])){
                return true;
            }
            m.put(nums[right],0);
            right++;
            }
            m.remove(nums[left]);
            left++;
            
        }
        return false;
    }
}