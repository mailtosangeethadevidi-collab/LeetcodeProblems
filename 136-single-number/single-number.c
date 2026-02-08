int fun(int *nu,int num,int n) 
{
    int i;
    int count=0;
    for (i=0;i<n;i++) 
    {
          if(nu[i] == num) 
        {
            count++ ;   
            if (count==2) 
            break ; 
        }
        
        
    }
    return count;
}
int singleNumber(int* nums, int numsSize) {
    int i ;
    for (i=0;i<numsSize;i++) 
    {
         if(fun(nums,nums[i],numsSize)==1)
           return nums[i];
        
    }
    return 1;
}
