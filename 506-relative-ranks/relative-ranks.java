import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] score) {
  PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->b[0]-a[0]);
  for(int i=0;i<score.length;i++){
    pq.offer(new int[]{score[i],i});
  }

  String res[]=new String[score.length];
  int row=1;
  while(!pq.isEmpty()){
    int cur[]=pq.poll();
    if(row==1)
    res[cur[1]]="Gold Medal";
    else if(row==2)
     res[cur[1]]="Silver Medal";
     else if(row==3)
     res[cur[1]]="Bronze Medal";
      else
      res[cur[1]]=row+"";
      row++;
  }
  return res;

    }
}