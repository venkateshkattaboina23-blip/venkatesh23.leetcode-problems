class Solution {
    public int maximum69Number (int num) {
        // Convert number to string
        String s = String.valueOf(num);
        
        // Replace the first '6' with '9'
        s = s.replaceFirst("6", "9");
        
        // Convert back to integer
        return Integer.parseInt(s);
    }

    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.maximum69Number(9669);
        System.out.println(result); // Output: 9969
    }
}
