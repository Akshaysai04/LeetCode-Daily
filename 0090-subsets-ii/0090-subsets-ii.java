class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(a,new ArrayList<>(),0,nums);
        return a;
    }
    private void backtrack(List<List<Integer>> a,List<Integer> temp,int idx,int[] nums)
    {
        a.add(new ArrayList<>(temp));
        if(idx==nums.length)
        {
            return;
        }
        for(int i=idx;i<nums.length;i++){
            if(i > idx && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(a,temp,i+1,nums);
            temp.remove(temp.size()-1);
        }
    }
}