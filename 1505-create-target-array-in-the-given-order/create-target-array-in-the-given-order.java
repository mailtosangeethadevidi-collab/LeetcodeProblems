import java.util.*;
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(index[i],nums[i]);
        }
        int temp[]=new int[nums.length];
        for(int i=0;i<l.size();i++){
            temp[i]=l.get(i);
        }
       return temp;
    }
}