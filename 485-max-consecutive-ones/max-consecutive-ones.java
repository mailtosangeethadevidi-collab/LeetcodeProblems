class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=1;
        int maxcount=0;
        if(nums.length==1 &&nums[0]==0)
          return 0;
        if(nums.length==1 &&nums[0]==1)
            return 1;
            int flag=0;
        if(nums.length==2){
            if(nums[0]==0 && nums[1]==0)
              return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==1)
              flag=1;
            if(nums[i]==nums[i+1] && nums[i]==1){
                count++;
                flag=1;
            }
            else{
                if(count>maxcount){
                    maxcount=count;
                }
                count=1;
            }
        }
        if(count>maxcount){
            maxcount=count;
        }
       
      //  if(flag==1){
        if(nums.length==2 && count==1){
        if(nums[0]==1 || nums[1]==1) 
             return 1;
        }
          if(flag==0)
          return 0;   
        if(count>0){
           if(count>maxcount){
            return count;
           }
           else
           {
            return maxcount;
           }
        }
       // }
       
    
        return 0;
    }
}