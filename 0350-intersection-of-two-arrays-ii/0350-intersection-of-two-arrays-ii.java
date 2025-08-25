class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> b=new HashMap<>();
        for(int i:nums1){
            b.put(i,b.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            if(b.containsKey(i) && b.get(i)>0){
                a.add(i);
                b.put(i,b.getOrDefault(i,0)-1);
            }
        }
        int arr[]=new int[a.size()];
      int   j=0;
        for(int i:a){
            arr[j]=i;
            j++;
        }
        return arr;
    }
}