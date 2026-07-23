class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
       
       Arrays.sort(nums);
        if(nums.length<4){
            return l;
        }
        else{
            for(int i=0;i<=(nums.length-4);i++){
                 if(i>0&&nums[i]==nums[i-1])
                   continue;
                
                
                
                

                 for(int f=i+1;f<=nums.length-3;f++){

                     int j=nums.length-1;
                     int k=f+1;

                    if(f>i+1&&nums[f]==nums[f-1])
                      continue;
                 while(k<j){
                    long sum=(long)nums[i]+nums[f]+nums[k]+nums[j];
                    if(sum==target){
                        l.add(Arrays.asList(nums[i],nums[f],nums[k],nums[j]));
                        while(k<j&&nums[k]==nums[k+1]){
                            k++;
                        }
                        while(k<j&&nums[j]==nums[j-1]){
                            j--;
                        }
                        k++;
                        j--;
                    }
                    else if(sum>target){
                        j--;
                    }
                    else{
                        k++;
                    }

                 }
               
             }

            }
        }
        return l;

    }
}