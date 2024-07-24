class Solution 
{
    public boolean isHappy(int n) 
    {
        while(n!=4 && n!=1)
        {
            int sum=0;
            while(n!=0)
            {
                int r=n%10;
                sum+=r*r;
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }



    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.isHappy(19));
    }
}