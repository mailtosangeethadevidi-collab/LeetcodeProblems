class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            while(i<j &&nums[i]!=val){
                i++;
                
            }
            while(i<j &&nums[j]==val){
               j--;
               
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            
             i++;
             j--;
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=val)
              index++;
        }
        return index;
    }
}