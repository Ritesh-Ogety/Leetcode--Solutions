class Solution 
{
    public int reverseDegree(String s)
    {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            char pchar=s.charAt(i);
            int revPosition=27-(Character.toLowerCase(pchar)-'a'+1);
            int product=revPosition*(i+1);
            sum+=product;
        }
        return sum;
    }
}