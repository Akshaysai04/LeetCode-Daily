class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> a=new ArrayList<>();
        backtrack(a,num,target,new StringBuilder(),0,0,0);
        return a;
    }
    private void backtrack(List<String> result, String num, int target,
                           StringBuilder expr, int index, long eval, long prev)
    {
        if(index==num.length())
        {
            if(eval==target){
            result.add(expr.toString());
        }
        return;
    }
    for(int i=index;i<num.length();i++)
    {
        if(i!=index && num.charAt(index)=='0') break;
        long curr = Long.parseLong(num.substring(index, i + 1));
        int len = expr.length();
        if (index == 0) {
    expr.append(curr);
    backtrack(result, num, target, expr, i + 1, curr, curr);
    expr.setLength(len);
}else{
    expr.append('+').append(curr);
                backtrack(result, num, target, expr, i + 1, eval + curr, curr);
                expr.setLength(len);

                // subtraction
                expr.append('-').append(curr);
                backtrack(result, num, target, expr, i + 1, eval - curr, -curr);
                expr.setLength(len);

                // multiplication
                expr.append('*').append(curr);
                backtrack(result, num, target, expr, i + 1, eval - prev + prev * curr, prev * curr);
                expr.setLength(len);
}
    }
}
}