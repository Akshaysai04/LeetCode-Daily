class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> sub=new ArrayList<>();
        generate(nums,0,new ArrayList<>(),sub);
        int r=0;
        for(List<Integer> s:sub){
            int suv=0;
            for(int num:s)
            {
                suv^=num;
            }
            r+=suv;
        }
        return r;
    }
    private void generate(int[] nums,int idx,List<Integer> sub,List<List<Integer>> subsets )
    {
        if(idx==nums.length)
        {
            subsets.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[idx]);
        generate(nums,idx+1,sub,subsets);
        sub.remove(sub.size()-1);
        generate(nums,idx+1,sub,subsets);
    }
}