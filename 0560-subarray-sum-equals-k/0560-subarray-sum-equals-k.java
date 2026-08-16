class Solution {
    public int subarraySum(int[] nums, int k) {
    int prefixsum=0;
    int count=0;
    HashMap<Integer,Integer> ans=new HashMap<>();
    ans.put(0,1);
    for(int i=0;i<nums.length;i++)
    {
        prefixsum+=nums[i];
        int remove=prefixsum-k;
        if(ans.containsKey(remove))
        {
            count+=ans.get(remove);
        }
        ans.put(prefixsum,ans.getOrDefault(prefixsum,0)+1);
    }
    return count;
    }
}