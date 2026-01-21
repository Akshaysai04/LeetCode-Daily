class Solution {
    public int longestPalindrome(String s) {
        char[] a=s.toCharArray();
        HashSet<Character> b=new HashSet<>();
        int res=0;
        for(char i:a){
            if(b.contains(i)){
                b.remove(i);
                res+=2;
            }else{
                b.add(i);
            }
        }
        if(!b.isEmpty()){
            res++;
        }
        return res;
    }
}