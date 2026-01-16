class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] a=new int[2];
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                a[count++]=nums[i];
            }
        }
        return a;

    }
}