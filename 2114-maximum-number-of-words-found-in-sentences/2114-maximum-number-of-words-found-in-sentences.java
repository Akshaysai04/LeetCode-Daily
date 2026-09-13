class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(String a:sentences)
        {
            String words[]=a.split("\\s+");
            count=Math.max(count,words.length);
        }
        return count;
    }
}