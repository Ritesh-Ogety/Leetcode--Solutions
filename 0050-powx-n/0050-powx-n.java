class Solution {
    public double myPow(double x, int n) 
    {
        return (double) Math.pow(x,n);
    }

    public static void main(String[] args)
    {
        Solution s1=new Solution();
       System.out.println( s1.myPow(2.00000, 10));
    }
}