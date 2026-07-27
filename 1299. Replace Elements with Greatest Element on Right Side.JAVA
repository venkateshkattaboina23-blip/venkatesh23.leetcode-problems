class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        
        result[n - 1] = -1;
        
        int maxRight = arr[n - 1];
        
        for (int i = n - 2; i >= 0; i--) {
            result[i] = maxRight;
            maxRight = Math.max(maxRight, arr[i]);
        }
        
        return result;
    }
}
