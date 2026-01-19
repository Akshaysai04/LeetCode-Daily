class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> a=new ArrayList<>();
        HashMap<Integer,List<Integer>> s=new HashMap<>();
        for(int i=0;i<groupSizes.length;i++){
            if(!s.containsKey(groupSizes[i])){
                s.put(groupSizes[i],new ArrayList<>());
            }
            List<Integer> g=s.get(groupSizes[i]);
            g.add(i);
            if(g.size()==groupSizes[i]){
                a.add(g);
                s.remove(groupSizes[i]);
            }
        }
        return a;

    }
}