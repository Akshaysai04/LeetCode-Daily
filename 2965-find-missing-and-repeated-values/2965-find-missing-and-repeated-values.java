class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int n=grid.length;
        int miss=-1;
        int repeat=-1;
        for(int i[]:grid)
        {
            for(int j:i)
            {
                a.put(j,a.getOrDefault(j,0)+1);
            }
        } 
        for(int i = 1; i <= n * n; i++)
        {
            if(!a.containsKey(i))
            {
                miss=i;
            }
           else if(a.get(i)==2){
               repeat=i; 
            }
        }
        return new int[]{repeat,miss};
    }
}