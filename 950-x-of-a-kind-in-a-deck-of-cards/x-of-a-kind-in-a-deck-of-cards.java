import java.util.*;
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        if(deck.length==1){
            return false;
        }
        for(int i:deck){
            map.put(i,map.getOrDefault(i,0)+1);
        }
       
        Iterator<Integer> it= map.values().iterator();
        int runningGcd=it.next();
        while(it.hasNext()){
            runningGcd= gcd(it.next(),runningGcd);
            if(runningGcd==1)
              return false;
        }
     return runningGcd>=2;   
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}