class Solution {
    public int arrangeCoins(int n) {
        int result=1;
        while(n>0)
        {
            result++;
            n=n-result;
        }
        return result-1;
    }
}