class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        int n=nums.length;
        boolean[] used=new boolean[n];
        solve(a,new ArrayList<>(),nums,used);
        return a;
    }
    private void solve(List<List<Integer>> a,List<Integer> b,int nums[],boolean[] used)
    {
        if(b.size()==nums.length)
        {
            a.add(new ArrayList<>(b));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!used[i]){
            b.add(nums[i]);
            used[i]=true;
            solve(a,b,nums,used);
            b.remove(b.size()-1);
            used[i]=false;
        }
        }
    }
}