class Solution {
    public int maxProduct(int[] nums) {
        int mxp = nums[0];  
        int mnp = nums[0];  
        int res = nums[0];  

        for (int i = 1; i < nums.length; i++) {
            int tempMax = mxp;
            int tempMin = mnp;

            mxp = Math.max(nums[i], Math.max(nums[i] * tempMax, nums[i] * tempMin));
            mnp = Math.min(nums[i], Math.min(nums[i] * tempMax, nums[i] * tempMin));

            res = Math.max(res, mxp);
        }

        return res;
    }
}