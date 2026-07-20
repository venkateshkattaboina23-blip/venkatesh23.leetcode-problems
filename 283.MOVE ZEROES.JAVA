import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        
        // Move all non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        
        // Fill remaining positions with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 1, 0, 3, 12};
        sol.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
        // Output: [1, 3, 12, 0, 0]
    }
}
