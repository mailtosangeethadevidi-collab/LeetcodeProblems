class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map = new HashMap<>();
        String d=paths.get(0).get(1);
        int i=0;
        for(List<String> path:paths){
            map.put(paths.get(i).get(0),paths.get(i).get(1));
            i++;
        }
        while(map.containsKey(d)){
            d=map.get(d);
        }
        return d;
    }
}