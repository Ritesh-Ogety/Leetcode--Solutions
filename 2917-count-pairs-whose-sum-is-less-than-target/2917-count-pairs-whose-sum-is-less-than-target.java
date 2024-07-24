class Solution
{
    public int countPairs(List<Integer> nums, int target) 
    {
        Integer [] arr1=nums.toArray(new Integer[0]);
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]+arr1[j]<target)
                {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String [] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.countPairs(List.of(-1,1,2,3,1),2));

    }


}