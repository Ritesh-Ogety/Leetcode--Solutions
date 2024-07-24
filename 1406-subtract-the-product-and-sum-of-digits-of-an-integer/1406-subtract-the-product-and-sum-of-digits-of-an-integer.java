class Solution 
{
    public int subtractProductAndSum(int n) 
    {
        if(n==0) return 0;
        int num=n;
        int sum=0;
        int product=1;
        while(n!=0)
        {
            int r=n%10;
            sum+=r;
            n/=10;
        }
        while(num!=0)
        {
            int r=num%10;
            product*=r;
            num/=10;
        }
        return product-sum;
    }

    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.subtractProductAndSum(234));
    }

}