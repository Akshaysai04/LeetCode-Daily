class Solution {
    public int lengthOfLongestSubstring(String s) {
        int c=0;
        int i=0;
        int max=0;
        HashSet<Character> a=new HashSet<>();
        for(int right=0;right<s.length();right++)
        {
            while(a.contains(s.charAt(right)))
            {
                a.remove(s.charAt(i));
                i++;
            }
            a.add(s.charAt(right));
            max=Math.max(max,right-i+1);
        }
        return max;
    }
}