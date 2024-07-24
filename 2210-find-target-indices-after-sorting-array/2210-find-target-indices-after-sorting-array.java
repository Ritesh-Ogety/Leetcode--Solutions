import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> al = new ArrayList<>();
        for (int num : nums) {
            al.add(num);
        }
        List<Integer> result = new ArrayList<>();
        Collections.sort(al);
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).equals(target)) {
                result.add(i);
            }
        }
        return result;      
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3};
        Solution s1 = new Solution();
        System.out.println(s1.targetIndices(arr,2));
    }
}
