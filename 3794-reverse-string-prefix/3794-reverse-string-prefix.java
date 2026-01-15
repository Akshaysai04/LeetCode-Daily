class Solution {
    public String reversePrefix(String s, int k) {
            char[] a=s.toCharArray();
            for(int i=0;i<k/2;i++){
                char temp=a[i];
                a[i]=a[k-1-i];
                a[k-1-i]=temp;
            }
        return new String(a);
    }
}