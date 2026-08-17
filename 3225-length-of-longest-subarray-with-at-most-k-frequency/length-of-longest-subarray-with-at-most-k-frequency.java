class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
      int l=0;
      int r=0;
      int maxlen=0;
      int len=nums.length;
      HashMap<Integer,Integer> map = new HashMap<>();
      while(r<len){
        map.put(nums[r],map.getOrDefault(nums[r],0)+1);
        int count=map.get(nums[r]);
        while(count>k){
            map.put(nums[l],map.get(nums[l])-1);
            count=map.get(nums[r]);
            l++;
        }
        maxlen=Math.max(maxlen,r-l+1);
        r++;
      }  
      return maxlen;
    }
    }