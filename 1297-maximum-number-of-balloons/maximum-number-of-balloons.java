class Solution {
    public int maxNumberOfBalloons(String text) {
        int hash[]=new int[26];
        int minFreq=Integer.MAX_VALUE;
        for(char ch :text.toCharArray()){
            if(ch=='b' || ch=='a' || ch=='l' || ch=='o' || ch=='n')
            {
                hash[ch-'a']++;
               
            }
        }
        System.out.println(Arrays.toString(hash));
        minFreq=Math.min(hash['b'-'a'],Math.min(hash['a'-'a'],hash['n'-'a']));
        int freq=Math.min(hash['l'-'a'],hash['o'-'a'])/2;
        System.out.println("freq="+freq+"minfreq"+minFreq);
        return Math.min(minFreq,freq);
        
    }
}