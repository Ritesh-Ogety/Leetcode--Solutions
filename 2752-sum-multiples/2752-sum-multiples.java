class Solution 
{
    public int sumOfMultiples(int n) 
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 || i%5==0 || i%7==0)
            {
                sum+=i;
            }
        }
        return sum;
    }


    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.sumOfMultiples(7));
    }
}