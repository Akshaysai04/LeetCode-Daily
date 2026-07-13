class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        backtrack(ans,"",n,n);
        return ans;
    }
    private void backtrack(List<String> ans,String ss,int close,int open)
    {
        if(open==0 && close==0)
        {
            ans.add(ss);
        }
        if(open>0)
        {
            backtrack(ans,ss+"(",close,open-1);
        }
        if(close>open)
        {
            backtrack(ans,ss+")",close-1,open);
        }
    }
}