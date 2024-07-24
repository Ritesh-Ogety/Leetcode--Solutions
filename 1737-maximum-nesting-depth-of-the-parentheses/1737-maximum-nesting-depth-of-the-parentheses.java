class Solution 
{
    public int maxDepth(String s)  
    {
        int count=0;
        int maxCount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
            }
            if(maxCount<count)
            {
                maxCount=count;
            }
            else if(s.charAt(i)==')')
            {
                count--;
            }
        }
        return maxCount;
    }


    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.maxDepth("(1)+((2))+(((3)))"));
    }
}