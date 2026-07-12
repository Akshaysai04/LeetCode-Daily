class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> a=new ArrayList<>();
        backtrack(a,new ArrayList<>(),n,k,1);
        return a;
    }
    public void backtrack(List<List<Integer>> a,List<Integer> b,int n,int k,int start)
    {
        if(b.size() == k)
        {
            a.add(new ArrayList<>(b));
            return;
        }
        for(int i=start;i<=n;i++){
            b.add(i);
            backtrack(a,b,n,k,i+1);
            b.remove(b.size()-1);
        }
    }
}