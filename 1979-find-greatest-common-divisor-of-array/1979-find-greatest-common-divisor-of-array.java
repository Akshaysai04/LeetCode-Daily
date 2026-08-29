class Solution {
    public int findGCD(int[] nums) {
    Arrays.sort(nums);
    return gcd(nums[0],nums[nums.length-1]);
    }
    public int gcd(int i,int j)
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