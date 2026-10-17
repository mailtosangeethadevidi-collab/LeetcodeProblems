class Solution {
    public int maximumPopulation(int[][] logs) {
        int max=0;
        int year=2051;
       for(int j=0;j<logs.length;j++){
          int birth=logs[j][0];
          int count=1;
          for(int i=0;i<logs.length;i++){
             if(i!=j){

                if(logs[i][0]<=birth && birth<(logs[i][1]))
                // System.out.print("year = "+logs[i][0]);
                   count++;
             }

          }
          if(count>=max){
          
            
            if(count>max){
               year=birth;
              
            }else{
                year=Math.min(year,birth);
            }
            max=Math.max(max,count);
            // System.out.println(count);
            //    System.out.println(birth);
           
          }
       } 
       return year;
    }
}