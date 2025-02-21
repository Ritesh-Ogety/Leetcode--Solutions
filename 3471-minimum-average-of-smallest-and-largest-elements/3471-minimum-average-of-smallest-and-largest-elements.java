class Solution 
{
    public double minimumAverage(int[] nums)
    {
        int n=nums.length;
        Arrays.sort(nums);
        double [] arr=new double[n/2];
        int left=0;
        int right=n-1;
        int k=0;
        double min=Double.MAX_VALUE;
        while(left<right)
        {
            double avg=(nums[left]+nums[right])/2.0;
            arr[k]=avg;
            min=Math.min(min,avg);
            k++;
            left++;
            right--;
        }
        return min;
    }
}