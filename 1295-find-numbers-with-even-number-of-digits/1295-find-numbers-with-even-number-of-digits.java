class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums)
        {
            int even=countDigitsMath(i);
            if(even%2==0)
            {
                count++;
            }
        }
        return count;
    }
     public static int countDigitsMath(int n) {
        if (n == 0) return 1;
        // Take absolute value to handle negative numbers
        return (int) Math.floor(Math.log10(Math.abs(n))) + 1;
    }
}