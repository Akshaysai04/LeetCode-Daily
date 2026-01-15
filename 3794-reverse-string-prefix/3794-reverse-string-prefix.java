class Solution {
    public String reversePrefix(String s, int k) {
           char[] a=s.toCharArray();
           StringBuilder b=new StringBuilder();
           for(int i=k-1;i>=0;i--){
                b.append(a[i]);
           }
           for(int i=k;i<a.length;i++){
                b.append(a[i]);
           }
           return b.toString();
    }
}