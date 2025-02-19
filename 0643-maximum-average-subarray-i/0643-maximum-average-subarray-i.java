class Solution 
{
    public double findMaxAverage(int[] nums, int k) 
    {
        // double avg=Double.NEGATIVE_INFINITY;
        double sum=0;
        
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        double max=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum-nums[i-k]+nums[i];
            max=Math.max(sum,max);
        }
        return max/k;
    }

}
/* Brute force;
 double max=Double.NEGATIVE_INFINITY;
        
        for(int i=0;i<=nums.length-k;i++)
        {
            double sum=0;
            for(int j=i;j<i+k;j++)
            {
                sum+=nums[j];
            }
            double avg=sum/k;
            max=Math.max(avg,max);
        }
        return max;
    }
 */