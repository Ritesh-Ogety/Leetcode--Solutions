class Solution 
{
    public int[] sortArrayByParity(int[] nums) 
    {
        int n=nums.length;
        Arrays.sort(nums);
        int [] res=new int[n];
        int start=0;
        int end=res.length-1;
        for(int num : nums)
        {
            if(num%2==0)
            {
                res[start++]=num;
            }
            else
            {
                res[end--]=num;
            }
        }
        return res;    
    }
}