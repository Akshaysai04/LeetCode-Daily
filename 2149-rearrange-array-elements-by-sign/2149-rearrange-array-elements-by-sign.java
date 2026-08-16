class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0;
        int neg=1;
        int a[]=new int[nums.length];
        for(int i:nums)
        {
            if(i>0)
            {
                a[pos]=i;
                pos=pos+2;
            }
            else
            {
                a[neg]=i;
                neg=neg+2;
            }
        }
        return a;
    }
}