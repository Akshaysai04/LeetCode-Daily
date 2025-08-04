class Solution {
    public int minimumOperations(int[] nums) {
        int a=0;
        for(int i:nums){
            if(i%3!=0){
                a=a+1;
            }
        }
        return a;
    }
}