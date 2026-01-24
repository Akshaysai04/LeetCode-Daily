class Solution {
    public int[][] generateMatrix(int n) {
        int a[][]=new int[n][n];
        int top=0;
        int down=n-1;
        int left=0;
        int right=n-1;
        int k=1;
        int l=n*n;
        while(left<=right && top<=down){
            for(int i=left;i<=right;i++){
                a[top][i]=k++;
            }
            top++;
            for(int i=top;i<=down;i++){
                a[i][right]=k++;
            }
            right--;
            if(top<=down){
            for(int i=right;i>=left;i--){
                a[down][i]=k++;
            }
            down--;
            }
            if(left<=right){
            for(int i=down;i>=top;i--){
                a[i][left]=k++;
            }
            left++;
            }
        }
        return a;
    }
}