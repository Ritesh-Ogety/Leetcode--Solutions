class Solution 
{
    public long maximumTripletValue(int[] nums) 
    {
       long maxTriplet=0;
       long maxDifference=0;
       long maxElement=0;

       for(int num: nums)
       {
            maxTriplet=Math.max(maxTriplet,maxDifference*num);
            maxDifference=Math.max(maxDifference,maxElement-num);
            maxElement=Math.max(maxElement,num);
       }
       return maxTriplet;
    }
}

/*
    Brute Force Approach

     int n=nums.length;
        
        long maxTriplet=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    maxTriplet=Math.max(maxTriplet,(nums[i]-nums[j])*nums[k]);
                }
            }
        }
        return maxTriplet;
 */