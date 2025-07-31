class Solution {
    public int maxSubArray(int[] nums) {
     int  cs=0;
     int max=Integer.MIN_VALUE;
     for(int i:nums){
        cs=cs+i;
        max=Math.max(cs,max);
        if(cs<0){
            cs=0;
        }
     }
     return max;

    }
}