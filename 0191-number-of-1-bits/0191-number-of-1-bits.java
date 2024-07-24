class Solution 
{
    public int hammingWeight(int n)
    {
       String str=Integer.toBinaryString(n);
       int count=0;
       for(int i=0;i<str.length();i++)
       {
            if(str.charAt(i)=='1')
            {
                count++;
            }
       }
       return count; 
    }
    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.hammingWeight(11));
    }
}