import java.util.*;
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList();
        for(int i=left;i<=right;i++){
            int r=0;
            int flag=0;
            int temp=i;
            while(temp>0){
                r=temp%10;
                if(r==0){
                    flag=1;
                    break;
                }
                if(i%r!=0){
                   flag=1;
                   break;
                }
                temp/=10;
            }
            if(flag==0)
              list.add(i);
        }
        return list;
    }
}