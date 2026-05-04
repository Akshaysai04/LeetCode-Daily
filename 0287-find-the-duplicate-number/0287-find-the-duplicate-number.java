class Solution {
    public int findDuplicate(int[] nums) {
        int i=1;
        int j=nums.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            int count=0;
            for(int num:nums){
                if(num<=mid){
                    count++;
                }
            }
            if(count>mid)
            {
                j=mid;
            }else
            {
                i=mid+1;
            }
        }
        return i;
    }
}