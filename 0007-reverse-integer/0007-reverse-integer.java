class Solution 
{
    public int reverse(int x) 
    {
        
        long rev=0;
        int digits;
        while(x!=0)
        {
            digits=x%10;
            rev=rev*10+digits;
            x/=10;


            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE ){
                return 0;
            }
        }
        return (int)rev;
    }


    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.reverse(123));
    }
}