class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length<1){
            return nums[0];
        }
        int a=0;
        for(int num:nums){
            a=a^num;
        }
        return a;
    }
}