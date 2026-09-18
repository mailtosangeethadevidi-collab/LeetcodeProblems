class Solution {
    public int[] frequencySort(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
      ArrayList<Integer> al = new ArrayList<>();
      for(int ele:nums){
        map.put(ele,map.getOrDefault(ele,0)+1);
        al.add(ele);
      }
      Collections.sort(al,(a,b)->{
        int fa=map.get(a);
        int fb=map.get(b);
        if(fa!=fb){
            return fa-fb;
        }
        else{
           return    b-a;
        }
      });

      int i=0;
      for(Integer ele :al){
         nums[i++]=ele;
      }

      return nums;

    }
}