class Solution 
{
    public int findContentChildren(int[] g, int[] s)
    {
       Arrays.sort(g);
       Arrays.sort(s);
       int greed=0;
       int children=0;

       while(greed<g.length && children<s.length)
       {
            if(s[children]>=g[greed])
            {
                greed++;
            }
            children++;
       }
       return greed;
    }
}