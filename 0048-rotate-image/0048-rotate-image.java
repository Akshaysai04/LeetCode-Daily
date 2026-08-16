class Solution {
    public void rotate(int[][] matrix) {
    reversediagonal(matrix);
    reverserow(matrix);
    }
    public void reversediagonal(int[][] matrix)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix.length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public void reverserow(int[][] mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            int left = 0, right = mat.length - 1;

            // Swap elements from both ends moving toward center
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}