class Solution 
{
    public int countKConstraintSubstrings(String s, int k) 
    {
        int n=s.length();
        int left=0;
        int zeroCount=0;
        int oneCount=0;
        int count=0;
        for(int right=0;right<n;right++)
        {
            if(s.charAt(right)=='0')
            {
                zeroCount++;
            }
            if(s.charAt(right)=='1')
            {
                oneCount++;
            }
            while(zeroCount>k && oneCount>k)
            {
                if(s.charAt(left)=='0')
                {
                    zeroCount--;
                }
                else
                {
                    oneCount--;
                }
                left++;
            }
            count+=right-left+1;
        }
        return count;       
    }
}