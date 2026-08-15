class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int comple=target-nums[i];
            if(a.containsKey(comple))
            {
                return new int[]{a.get(comple),i};
            }
            a.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}