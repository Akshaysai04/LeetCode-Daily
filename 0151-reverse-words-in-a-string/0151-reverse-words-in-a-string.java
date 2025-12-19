class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] words=s.split("\\s+");
        StringBuilder a=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            a.append(words[i]);
            if(i>0){
                a.append(" ");
            }
        }
        return a.toString();
    }
}