class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        
        int l=0;
        int n=colors.length;
        int r=2;
        int count=0;
        while(l<n){
            
            if((l!=n-1)&&colors[l]==colors[r] && colors[l]!=colors[l+1]){
               
                count++;
            }
            if((l==n-1)&&colors[l]==colors[r] && colors[l]!=colors[r-1]){
                count++;
            }
            l++;
            r=(r+1)%n;
        }
        return count;
    }
}