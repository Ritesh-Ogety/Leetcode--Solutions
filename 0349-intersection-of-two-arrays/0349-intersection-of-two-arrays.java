import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        
        // Add elements of nums1 to set
        for (int num : nums1) {
            set.add(num);
        }
        
        // Check for common elements with nums2
        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }
        
        // Convert intersection set to array
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        Solution solution = new Solution();
        int[] intersection = solution.intersection(nums1, nums2);
        
        // Output the result
        System.out.print("[");
        for (int i = 0; i < intersection.length; i++) {
            System.out.print(intersection[i]);
            if (i < intersection.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
