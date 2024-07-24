class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int result=0;
        for(int num: nums)
        {
            result=result^num;
        }
        return result;
    }


    public static void main(String[] args)
    {
        int [] arr={2,2,1};
        Solution s1=new Solution();
        System.out.println(s1.singleNumber(arr));
    }
}
