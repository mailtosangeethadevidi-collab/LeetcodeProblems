class Solution {
    public String mostCommonWord(String paragraph, String[] ban) {
        String arr[]=paragraph.replaceAll("\\W+"," ").toLowerCase().split("\\s+");
        // System.out.println(Arrays.toString(arr));
        HashMap<String,Integer> map = new HashMap<>();
       HashSet<String> banned= new HashSet<>(Arrays.asList(ban));
        int maxfreq=0;
        String maxOccured="";

        for(String str:arr){
            if(!banned.contains(str)){
            map.put(str,map.getOrDefault(str,0)+1);
            int freq=map.get(str);
            if(freq>maxfreq ){
                maxfreq=freq;
                maxOccured=str;
            }
            }
        }
        return maxOccured;
    }
}