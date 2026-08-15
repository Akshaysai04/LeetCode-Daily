class Solution {
    public int majorityElement(int[] nums) {
      int ca=0;
        int ele=0;
        for(int i=0;i<nums.length;i++)
        {
            if(ca==0)
            {
                ele=nums[i];
                ca=1;
            }
            else if(ele==nums[i])
            {
                ca++;
            }
            else
            {
                ca--;
            }
        }
        int cnt=0;
        for(int i:nums)
        {
            if(i==ele)
            {
                cnt++;
            }
        }
        if(cnt>(nums.length/2))
        {
            return ele;
        }
        return -1;  
    }
}