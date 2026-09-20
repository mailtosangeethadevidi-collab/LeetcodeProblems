class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){

            int mid=(low+high)/2;
            
            if(nums[mid]==target){
                return true;
            }
            // handle duplicates

            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }

            if(nums[low]<=nums[mid]){  //left is sorted
               

              if(nums[low]<=target && target<nums[mid]){
                high=mid-1;           // target is less than mid. so,go left
              }
              else{
                low=mid+1;                //target greater than the range .so, go right
              }

            }
            else{  //right is sorted
                 
               if(nums[mid]<target && target<=nums[high]){
                //   mid is less than target. so go right
                 low=mid+1;
               }
               else{
                high=mid-1; //target is less than the range . so go left
               }

            }
        }
        return false;
        
    }
}