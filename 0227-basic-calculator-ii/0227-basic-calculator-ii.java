class Solution {
    public int calculate(String s) {
        char[] chs = s.toCharArray();
        int curRes = 0; // Current result for the current operation
        int val = 0;    // Value of the current number
        int res = 0;    // Total result
        char sign = '+'; // Initial sign
        
        for (int i = 0; i < chs.length; i++) {
            char c = chs[i];
            if (Character.isDigit(c)) {
                val = val * 10 + (c - '0'); // Build the number
            }
            // Check for operators or the end of the string
            if (c == '+' || c == '-' || c == '*' || c == '/' || i == chs.length - 1) {
                switch (sign) {
                    case '+':
                        res += curRes; // Add current result to total
                        curRes = val;  // Update current result
                        break;
                    case '-':
                        res += curRes; // Add current result to total
                        curRes = -val; // Update current result as negative
                        break;
                    case '*':
                        curRes *= val; // Multiply current result
                        break;
                    case '/':
                        // Handle division by zero
                        if (val != 0) {
                            curRes /= val; // Divide current result
                        } else {
                            throw new ArithmeticException("Division by zero");
                        }
                        break;
                }
                sign = c; // Update the sign
                val = 0;  // Reset value for the next number
            }
        }
        
        // Add the last processed value to the result
        return res + curRes;
    }
}
