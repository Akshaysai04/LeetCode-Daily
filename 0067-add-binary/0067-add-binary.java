class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        // Pointers for iterating from the right (least significant bit)
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Loop until both strings are fully processed and there's no carry
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            // Add bit from string 'a' if available
            if (i >= 0) {
                sum += a.charAt(i--) - '0'; // Convert char '0' or '1' to int 0 or 1
            }

            // Add bit from string 'b' if available
            if (j >= 0) {
                sum += b.charAt(j--) - '0'; // Convert char '0' or '1' to int 0 or 1
            }

            // Calculate current bit for the result (sum % 2)
            // and the carry for the next iteration (sum / 2)
            result.insert(0, sum % 2); // Insert at the beginning to build the string in correct order
            carry = sum / 2;
        }

        return result.toString();  }
}