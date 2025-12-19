class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            // move i forward until vowel
            while (i < j && !isVowel(a[i])) {
                i++;
            }
            // move j backward until vowel
            while (i < j && !isVowel(a[j])) {
                j--;
            }
            // now both are vowels, swap
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return new String(a);
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}