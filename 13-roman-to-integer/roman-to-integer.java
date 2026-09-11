import java.util.*;
class Solution {
    public int romanToInt(String s) {
        HashMap <Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int num=0;
        int i=0;
        int n = s.length();
        for( i=0;i<n-1;){
            int first=map.get(s.charAt(i));
            int second=map.get(s.charAt(i+1));
            if(first>=second){
                num+=first;
            }
            else{
                num+=second-first;
                i++;
            }
            i++;
        }
        if(i<n&&map.get(s.charAt(n-1))<=map.get(s.charAt(n-1))){
            num+=map.get(s.charAt(i));
        }
        return num;
    }
}