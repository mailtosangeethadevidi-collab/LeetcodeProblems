int removeElement(int* nums, int numsSize, int val) 
{
    int x = 0; 
    int i ;  

    for(i = 0; i < numsSize; i++)
    {
        if(nums[i]!= val)
        {
            nums[x] = nums[i];
            x++ ;
        }
    }
    return x;

    
}