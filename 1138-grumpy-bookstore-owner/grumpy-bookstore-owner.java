class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int g=0;
        int not=0;
        int maxg=0;
        int l=0;
        for(int r=0;r<customers.length;r++){
            if(grumpy[r]==0){
                not+=customers[r];
            }
            else{
                g+=customers[r];
            }
            if(r-l+1==minutes){
                maxg=Math.max(maxg,g);
                if(grumpy[l]==1){
                    g-=customers[l];
                }
                l++;
            }
        }
        return maxg+not;
    }
}