class Solution {
    public int secondHighest(String s) {
        char arr[]=s.toCharArray();
        int fmax=-1;
        int smax=-1;
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(Character.isDigit(ch)){
                    int digit=ch-'0';
                    if(digit>fmax && digit !=fmax){
                        smax=fmax;
                        fmax=digit;
                    }
                    else if(digit>smax && digit!=fmax){
                        smax=digit;
                    }
            }
        }
        if(smax==-1){
        return -1;
        }
        return smax;
    }
}