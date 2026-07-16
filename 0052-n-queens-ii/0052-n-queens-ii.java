class Solution {
    public int totalNQueens(int n) {
        ArrayList<String> ans=new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        backtrack(board,ans,0);
        return ans.size();
    }
    private void backtrack(char[][] board,ArrayList<String> a,int row)
    {
        if(row==board.length)
        {
            a.add(".");
        }
        for(int i=0;i<board.length;i++)
        {
            if(isSafe(board,row,i)){
            board[row][i]='Q';
            backtrack(board,a,row+1);
            board[row][i]='.';
        }
        }
    }
    public static boolean isSafe(char[][] board,int row,int col)
    {
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }
}