class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int sum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                int a=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-a)<Math.abs(target-sum))
                {
                    sum=a;
                }
                if(a==target)
                {return target;}
                else if(a<target)
                {
                    left++;
                }else
                {
                    right--;
                }
            }
        }
        return sum;
    }
}