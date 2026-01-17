class Solution {
    public int[] leftRightDifference(int[] nums) {
       int[] left=new int[nums.length];
       int[] right=new int[nums.length];
       int lef=0;
       int rig=0;
       for(int i=0;i<nums.length;i++){
           left[i]=lef;
           lef+=nums[i];
       } 
       for(int i=nums.length-1;i>=0;i--){
           right[i]=rig;
           rig+=nums[i];
       }
       for(int i=0;i<nums.length;i++){
           nums[i]=Math.abs(left[i]-right[i]);
       }
       return nums;
    }
}