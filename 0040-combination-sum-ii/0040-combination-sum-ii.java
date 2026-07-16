class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> a=new ArrayList<>();
    Arrays.sort(candidates);
    backtrack(a,new ArrayList<>(),candidates,target,0);
    return a;
    }
    private void backtrack(List<List<Integer>> ans,List<Integer> temp ,int[] candidates,int remain,int idx)
    {
        if(remain==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<candidates.length;i++)
        {
            if(i>idx && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>remain) break;
            temp.add(candidates[i]);
            backtrack(ans,temp,candidates,remain-candidates[i],i+1);
            temp.remove(temp.size()-1);
        }
    }
}