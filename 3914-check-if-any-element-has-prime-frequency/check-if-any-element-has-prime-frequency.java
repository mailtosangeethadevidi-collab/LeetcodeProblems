class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap();
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }
       for(int f:map.values()){
        if(isP(f))
          return true;
       }
     return false;
    }
    public static boolean isP(int num){
        if(num<2)
         return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
              return false;
        }
        return true;
    }
}