class Solution {
    public int commonFactors(int a, int b) {
        int max=Math.max(a,b);
        int count=0;
        for(int x=1;x<=max;x++)
        {
            if(a%x==0 && b%x==0)
            {
                count++;
            }
        }
        return count;
    }
}