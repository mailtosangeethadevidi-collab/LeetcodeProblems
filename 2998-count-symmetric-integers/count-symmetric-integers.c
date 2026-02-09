int countSymmetricIntegers(int low, int high) 
{
    int count=0 ;

    for(int a=low;a<=high;a++) 
    {
        char str[20] ;
        sprintf(str,"%d",a) ;

        int x = strlen(str) ;

        if(x%2==0) 
        {
            int y = x/2 ;
            int i,j,sum1=0,sum2=0;
            
            for(i=0;i<y;i++) 
                sum1 += str[i] - '0';

            for(j=y;j<x;j++) 
                sum2 += str[j] - '0';

            if (sum1==sum2)
                count++ ;
        }
    }
    
    return count ;
}
