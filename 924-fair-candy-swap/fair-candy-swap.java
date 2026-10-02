class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal=0;
        int bobTotal=0;
        for(int i:aliceSizes){
            aliceTotal+=i;
        }
        for(int i:bobSizes){
            bobTotal+=i;
        }
        for(int i=0;i<aliceSizes.length;i++){
            int aliceTemp=aliceTotal-aliceSizes[i];
            for(int j=0;j<bobSizes.length;j++){
                if(aliceTemp+bobSizes[j]==bobTotal-bobSizes[j]+aliceSizes[i]){
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
       return new int[]{0,0};
    }
}