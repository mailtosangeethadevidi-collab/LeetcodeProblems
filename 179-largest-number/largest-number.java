class Solution {
    public String largestNumber(int[] nums) {
        List<String> l = new ArrayList<>();
        boolean areAllZeroes=true;
        int zeroCount=0;
        for(int num:nums){
            if(num!=0){
                areAllZeroes=false;
            }
            l.add(num+"");   
        }
        if(areAllZeroes){
            return "0";
        }
       
        Collections.sort(l,(a,b)->{
            return (b+a).compareTo(a+b);
        });

        StringBuilder sb = new StringBuilder();
        for(String str:l){
            sb.append(str);
        }
      
        return sb.toString();

    }
}