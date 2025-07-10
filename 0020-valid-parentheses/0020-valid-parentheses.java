class Solution {
    public boolean isValid(String s) {
         Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                st.push(currentChar);
            } else {
                if (st.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char topChar = st.peek();
                if ((topChar == '(' && currentChar == ')') || 
                    (topChar == '[' && currentChar == ']') || 
                    (topChar == '{' && currentChar == '}')) {
                    st.pop();
                } else {
                    return false; // Mismatched brackets
                }
            }
        }
        
        return st.isEmpty(); 
    }
}