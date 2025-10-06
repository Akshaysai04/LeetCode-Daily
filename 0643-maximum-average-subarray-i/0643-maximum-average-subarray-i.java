class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int curr=0;
        for(int i=0;i<k;i++){
            curr+=nums[i];
        }
        int maxS=curr;
        for(int right=k;right<nums.length;right++){
            curr-=nums[left];
            curr+=nums[right];
            left++;
            maxS=Math.max(maxS,curr);
        }
        return (double) maxS/k;

    }
}