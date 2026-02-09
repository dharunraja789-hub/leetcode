// Last updated: 09/02/2026, 13:56:37
class Solution {
    public int findJudge(int n, int[][] trust) {
           
        if(n==1 && trust.length == 0) {
        return 1;
        }
        int [] count = new int[n+1];
        for(int i = 0;i<trust.length;i++){
            
            count[trust[i][0]]--;
            
            count[trust[i][1]]++;
        }

       for(int i = 0;i<count.length;i++){
           if(count[i] ==n-1) { 
            return i;
           }
       }
        return -1;
    }
    }
