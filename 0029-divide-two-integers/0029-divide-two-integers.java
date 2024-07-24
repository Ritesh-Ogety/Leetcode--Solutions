class Solution {
    public int divide(int dividend, int divisor) 
    {
        if(dividend==Integer.MIN_VALUE && divisor==-1)
        {
            return Integer.MAX_VALUE;
        }
        int val=0;
        if(divisor!=0)
        {
             val=dividend/divisor;
        }
        //int r;
        if(val>Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        
        else if(val<Integer.MIN_VALUE)    
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            return val;
        }
    }
    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.divide(10,3));
    }
}