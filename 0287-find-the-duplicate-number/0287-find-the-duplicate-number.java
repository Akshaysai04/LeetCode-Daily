class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int j=0;j<nums.length;j++)
        {
            if(s.contains(nums[j]))
            {
                return nums[j];
            }
            s.add(nums[j]);
        }
        return -1;
    }
}