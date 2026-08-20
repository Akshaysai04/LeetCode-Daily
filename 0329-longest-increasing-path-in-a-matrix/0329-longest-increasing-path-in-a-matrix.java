class Solution {
    static int n,m;
    static int[][] grid;
    static int[][] dp;
    static int[][] dirs={{-1,0},{1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
    n=matrix.length;
    m=matrix[0].length;
    grid=matrix;
    dp=new int[n][m];
    for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
    }
    int ans=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            ans=Math.max(ans,dfs(i,j));
        }
    }
    return ans;
    }
        static int dfs(int i,int j)
    {
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int best=1;
        for(int dir[]:dirs)
        {
            int ni=i+dir[0];
            int nj=j+dir[1];
            if(ni >= 0 && ni < n && nj >= 0 && nj < m )
            {
                if(grid[ni][nj]<grid[i][j])
                {
                    best=Math.max(best,1+dfs(ni,nj));
                }
            }
        }
        dp[i][j]=best;
        return best;
    }
    static int gcd(int i,int j)
    {
        i=Math.abs(i);
        j=Math.abs(j);
        while(j!=0)
        {
            int temp=j;
            j=i%j;
            i=temp;
        }
        return i;
    }
}