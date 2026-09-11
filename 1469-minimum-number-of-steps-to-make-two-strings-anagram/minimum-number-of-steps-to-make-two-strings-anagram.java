class Solution {
    public int minSteps(String s, String t) {
        int srr[]=new int[26];
        int trr[]=new int[26];
        int len=s.length();
        for(int i=0;i<len;i++){
            srr[s.charAt(i)-'a']++;
            trr[t.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<len;i++){
            char ch =t.charAt(i);
            if(trr[ch-'a']!=-1){
            if(srr[ch-'a']==0){
                count+=trr[ch-'a'];
            }
            else if(trr[ch-'a']>srr[ch-'a']){
                count+=(trr[ch-'a']-srr[ch-'a']);
            }
            }
            trr[ch-'a']=-1;
            
        }
        return count;

    }
}