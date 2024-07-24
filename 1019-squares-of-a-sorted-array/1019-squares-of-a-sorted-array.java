class Solution
{
    public int[] sortedSquares(int[] nums)
    {
        int [] res=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            res[k]=nums[i]*nums[i];
            k++;
        }
        Arrays.sort(res);

        return res;
    }


    public static void main(String[] args)
    {
        int [] arr={-4,-1,0,3,10};
        Solution s1=new Solution();
        System.out.print(s1.sortedSquares(arr));
    }
}