class Solution {
    public int[] resultArray(int[] nums) {
        int len=nums.length;
        int arr1[]=new int[len];
        int arr2[]=new int[len];

         arr1[0]=nums[0];
         arr2[0]=nums[1];
        int o=0;
        int t=0;
        for(int i=2;i<len;i++){
            if(arr1[o]>arr2[t]){
                o++;
                arr1[o]=nums[i];
            }
            else{
                t++;
                arr2[t]=nums[i];
            }
        }
        o++;
        int i=0;
         while(o<len){
             arr1[o++]=arr2[i++];
         }
        return arr1;

    }
}