class Solution {
    public int countBinarySubstrings(String s) {
        char arr[]=s.toCharArray();
        int total=0;
        int prev=0;
        int curr=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
              curr++;
            else{
                total+=Math.min(prev,curr);
                prev=curr;
                curr=1;
            }
        }
        total+=Math.min(prev,curr);
        return total;
    }
}