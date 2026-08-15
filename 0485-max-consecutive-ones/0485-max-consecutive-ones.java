class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int count=0;
    int temp=0;
    for(int i:nums)
    {
        if(i==1)
        {
            temp++;
        }
        else
        {
            count=Math.max(count,temp);
            temp=0;
        }
    }
    count=Math.max(count,temp);
    return count; 
    }
}