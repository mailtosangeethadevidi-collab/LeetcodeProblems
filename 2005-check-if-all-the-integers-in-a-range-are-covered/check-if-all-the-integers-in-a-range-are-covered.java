class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean found=false;
        while(left<=right){
             found=false;
            for(int []r:ranges){

                if(r[0]<=left && left<=r[1]){
                       found=true;
                       System.out.println(r[0]+"---"+r[1]);
                       break;
                }
            }
            if(!found)
              return false;

              left++;
        }
        return found;
    }
}