class Solution 
{
    public int arithmeticTriplets(int[] nums, int diff) 
    {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(i<j && j<k && nums[j]-nums[i]==diff && nums[k]-nums[j]==diff)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }


    public static void main(String[] args)
    {
        int [] arr={0,1,4,6,7,10};
        Solution s1=new Solution();
        System.out.println(s1.arithmeticTriplets(arr,3));
    }
}