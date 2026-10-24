class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int hash[]=new int [10];
        int min1=10;
        for(int num : nums1){
            hash[num]++;
            min1=Math.min(min1,num);
        }
        int min2=10;
        int commonMin=10;
        for(int num: nums2){
            if(hash[num]!=0){
                commonMin=Math.min(commonMin,num);
            }
            min2=Math.min(num,min2);

        }
        if(commonMin!=10)
          return commonMin;
        if(min1<min2){
            return min1*10+min2;
        }
        return min2*10+min1;
        
    }
}