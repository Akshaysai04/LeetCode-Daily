class Solution {
    public boolean isSubsequence(String s, String t) {
        int sx=0;
        int bx=0;
        while(sx<s.length() && bx<t.length()){
            if(s.charAt(sx)==t.charAt(bx)){
                sx++;
            }
            bx++;
        }
        return sx==s.length();
    }
}