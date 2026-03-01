class Solution {
    public int reverseDegree(String s) {
        s=s.toLowerCase();
        String a="abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(a);
        sb.reverse();
        String rev = sb.toString();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            int k = (i + 1) * (rev.indexOf(c) + 1);
            sum=sum+k;
        }
        return sum;
    }
}