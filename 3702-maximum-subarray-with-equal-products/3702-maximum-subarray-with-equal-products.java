class Solution
{
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
    public static int lcm(int a,int b)
    {
        return (a*b)/gcd(a,b);
    }
    public int maxLength(int[] nums) 
    {
        int n=nums.length;
        int res=1;
        for(int i=0;i<n;i++)
        {
            int mul=nums[i], gcd=nums[i], lcm=nums[i];
            for(int j=i+1;j<n;j++)
            {
                mul*=nums[j];
                gcd=gcd(gcd,nums[j]);
                lcm=lcm(lcm,nums[j]);
                if(mul==gcd*lcm)
                {
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;   
    }
}