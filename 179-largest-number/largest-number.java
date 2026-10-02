class Solution {
    public String largestNumber(int[] nums) {
        List<String> l = new ArrayList<>();
        boolean areAllZeroes=true;
        int zeroCount=0;
        for(int num:nums){
            if(num!=0){
            l.add(num+"");
            areAllZeroes=false;
            }
            else{
                zeroCount++;
            }
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
        while(zeroCount--!=0){
            sb.append("0");
        }
        return sb.toString();

    }
}