class Solution 
{
    public int distinctAverages(int[] nums) 
    {
        int n=nums.length;
        Set <Double> distinctAverages=new HashSet<>();
        Arrays.sort(nums);

        

        int i=0;
        int j=n-1;
        
        while(i<j)
        {
            double avg=(nums[i]+nums[j])/2.0;
            distinctAverages.add(avg);
            i++;
            j--;
        }
        return distinctAverages.size();
    }
}