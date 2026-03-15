import java.util.ArrayList;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
         List<String> l= new ArrayList<>();
         if(n==0)
           return l;
        if(n==1){
           l.add(nums[0]+"");
           return l;
        }
         int i=0;
         int start=0;
        int flag=0;
        for(i=0;i<n-1;i++){
           if(nums[i]-nums[i+1]!=-1){
             if(start!=i){
              l.add(nums[start]+"->"+nums[i]); 
              start=i+1;
             }
             else{
                 l.add(nums[start]+""); 
                 start=i+1;
             }
           }
        }
        if(nums[i]!=nums[i-1]+1)
          l.add(nums[i]+"");
          else {
            l.add(nums[start]+"->"+nums[i]);
          }
       
        return l;
        
    }
}