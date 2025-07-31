class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        int i=0;
        int j=1;
        for(int k:nums){
            if(k>0){
                a[i]=k;
                i=i+2;
            }else{
                a[j]=k;
                j=j+2;
            }
        }
        return a;
    }
}