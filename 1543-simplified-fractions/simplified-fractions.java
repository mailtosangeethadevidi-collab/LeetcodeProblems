class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> l = new ArrayList<>();
        int nu=1;
        int de=0;
        while(nu<n){
            de=nu+1;
            while(de<=n){
                if(gcd(nu,de)){
                    l.add(nu+"/"+de);
                }
                de++;
            }
            nu++;

        }
        return l;
    }
    public static boolean gcd(int a ,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a==1;
    }
}