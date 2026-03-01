class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> a=new HashSet<>();
        for(char c:jewels.toCharArray())
        {
            a.add(c);
        }
        int s=0;
        for(char c:stones.toCharArray())
        {
            if(a.contains(c))
            {
                s++;
            }
        }
        return s;
    }
}