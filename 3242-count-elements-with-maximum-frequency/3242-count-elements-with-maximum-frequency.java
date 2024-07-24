import java.util.*;
import java.util.stream.*;

class Solution {
     public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freqMp = new HashMap<>();
        int maxFreq = 0;
        for(var num : nums){
            freqMp.put(num, freqMp.getOrDefault(num, 0) + 1);
            maxFreq = Math.max(maxFreq, freqMp.get(num));
        }

        int maxFreqEleCnt = 0;
        for(var entry : freqMp.entrySet()){
            int currEleFreq = entry.getValue();
            if(currEleFreq == maxFreq){
                maxFreqEleCnt++;
            }
        }
        return maxFreq * maxFreqEleCnt;

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 1, 4};
        Solution s1 = new Solution();
        System.out.println(s1.maxFrequencyElements(arr1)); // Output: 4
        
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(s1.maxFrequencyElements(arr2)); // Output: 5
    }
}
