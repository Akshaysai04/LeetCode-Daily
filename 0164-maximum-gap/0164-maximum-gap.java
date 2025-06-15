class Solution {
    public int maximumGap(int[] nums) {
       if(nums.length<2){
        return 0;
       }
       int max=0;
       int c;
       Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++){
        c=nums[i+1]-nums[i];
        if(c>max){
max=c;            
        }
       }
       return max; 
    }
}