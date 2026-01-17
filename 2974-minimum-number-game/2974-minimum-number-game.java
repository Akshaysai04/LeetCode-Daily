class Solution {
    public int[] numberGame(int[] nums) {
        int a[]=new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                a[i]=nums[i+1];
                a[i+1]=nums[i];
            }
        }
        return a;
    }
}