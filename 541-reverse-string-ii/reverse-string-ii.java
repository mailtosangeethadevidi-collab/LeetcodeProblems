class Solution {
    public String reverseStr(String s, int k) {
       char temp[]=s.toCharArray();
       int start=0;
       int end=2*k;
       int len=s.length();
       if(k>len){
        reverse(0,len-1,temp);
        return new String(temp);
       }
       
       int remaining = len%end;
       if(remaining>=0){
        while(end<=len){
            reverse(start,end-k-1,temp);
            start=end;
            end+=(2*k);
        }
       }
       if(remaining<=k){
        reverse(start,len-1,temp);
       }
       else{
        reverse(start,start+k-1,temp);
       }

      return new String(temp);
        }
    public void reverse(int start,int end,char arr[]){
        while(start<end){
            char temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
           
        }
    }
    
}
        