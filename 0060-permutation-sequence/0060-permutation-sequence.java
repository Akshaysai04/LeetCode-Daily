class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        for(int i=1;i<n;i++)
        {
            fact=fact*i;
        }
        List<Integer> a=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            a.add(i);
        }
        k--;
        StringBuilder sd=new StringBuilder();
        while(!a.isEmpty())
        {
            int idx=k/fact;
            sd.append(a.get(idx));
            a.remove(idx);
            if (a.isEmpty()) {
                break;
            }
            k %= fact;
            fact =fact/a.size();
        }
        return sd.toString();
    }
}