import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; 
            }
            seen.add(num);
        }
        return false; 
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 1};

        System.out.println(sol.containsDuplicate(nums1)); // false
        System.out.println(sol.containsDuplicate(nums2)); // true
    }
}
