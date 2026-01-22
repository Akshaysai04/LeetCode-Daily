class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> a=new HashSet<>();
        HashSet<Integer> c=new HashSet<>();
        int[] b=new int[A.length];
        for(int i=0;i<A.length;i++){
            a.add(A[i]);
            c.add(B[i]);
            int d=0;
            for(int x:a){
                if(c.contains(x)){
                    d++;
                }
            }
            b[i]=d;
        }
        return b;
    }
}