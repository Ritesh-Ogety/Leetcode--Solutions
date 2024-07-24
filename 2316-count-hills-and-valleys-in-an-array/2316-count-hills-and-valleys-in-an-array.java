// we start from 1 to arr.length-1
// since we cannot take 2 adjacemnt values such that nums[i] == nums[j], we update the current value to previous value which will help us in counting the next hill or valley

class Solution {
 public int countHillValley(int[] a) {
        int result = 0;
        for (int i = 1;i<a.length-1;i++) {
            if (a[i] == a[i+1])
                a[i] = a[i-1];
            if (a[i] > a[i-1] && a[i] > a[i+1])
                result += 1;
            if (a[i] < a[i-1] && a[i] < a[i+1])
                result += 1;
        }

        return result;
    }

    

    

    public static void main(String[] args)
    {
        int [] arr={2,4,1,1,6,5};
        Solution s1=new Solution();
        System.out.println(s1.countHillValley(arr));
    }
}