class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int n=prices.length;
        int lprofit=0;
        int buyPrice=prices[0];
        for(int i=0;i<n;i++)
        {
            if(prices[i]<buyPrice)
            {
                buyPrice=prices[i];
            }
            else
            {
                int cprofit=prices[i]-buyPrice;
                lprofit=Math.max(cprofit,lprofit);
            }
        }
        return lprofit;
    }





    public static void main(String[] args)
    {
        int [] arr={7,1,5,3,6,4};
        Solution s1=new Solution();
        System.out.println(s1.maxProfit(arr));
    }
}













/*class Solution 
{
    public int maxProfit(int[] prices) 
    {
       
        int n=prices.length;
        int lprofit=0;
        for(int i=0;i<n;i++)
        {
            int cprofit=0;

            for(int j=i+1;j<n;j++)
            {
                if(prices[j]>prices[i])
                {
                    cprofit=prices[j]-prices[i];
                    lprofit=Math.max(cprofit,lprofit);
                }    
               
            }
        }
        return lprofit;
    }


    public static void main(String[] args)
    {
        int [] arr={7,1,5,3,6,4};
        Solution s1=new Solution();
        System.out.println(s1.maxProfit(arr));
    }
} */