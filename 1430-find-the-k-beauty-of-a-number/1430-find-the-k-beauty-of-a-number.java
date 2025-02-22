class Solution 
{
    public int divisorSubstrings(int num, int k) 
    {
        String str=String.valueOf(num);
        int n=str.length(); 
        if(n<k) return 0;

        int res=0;
        for(int i=0;i<=n-k;i++)
        {
            int div=Integer.parseInt(str.substring(i,i+k));
            if(div==0)
            {
                continue;
            }
            if(num%div==0)
            {
                res++;
            }
        }
        return res;       
    } 
}