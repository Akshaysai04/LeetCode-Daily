class Solution {
    public int maximumWealth(int[][] accounts) {
     int rich=0;
     for(int acc[]:accounts)
     {
        int m=0;
        for(int k:acc)
        {
            m+=k;
        }
        rich=Math.max(rich,m);
     }   
     return rich;
    }
}