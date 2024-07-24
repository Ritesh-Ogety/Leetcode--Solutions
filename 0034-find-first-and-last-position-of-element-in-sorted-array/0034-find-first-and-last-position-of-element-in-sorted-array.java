class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int firstOcc = -1;
        int lastOcc = -1;

        // Find the first occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                firstOcc = mid;
                high = mid - 1; // Continue searching towards the left
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Reset low and high for finding the last occurrence
        low = 0;
        high = nums.length - 1;

        // Find the last occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                lastOcc = mid;
                low = mid + 1; // Continue searching towards the right
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{firstOcc, lastOcc};
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        Solution s1 = new Solution();
        int[] result = s1.searchRange(arr, 8);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
