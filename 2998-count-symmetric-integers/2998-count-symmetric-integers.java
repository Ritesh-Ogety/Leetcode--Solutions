class Solution 
{
    public int countSymmetricIntegers(int low, int high) 
    {
        int count=0;

        while(low<=high)
        {
            int digits=0;
            int firstNSum=0;
            int lastNSum=0;
            int temp=low;
            while(temp!=0)
            {
                int digit=temp%10;
                digits++;
                temp/=10;
            }
            if(digits%2!=0)
            {
                low++;
                continue;
            }
            else
            {
                String num=Integer.toString(low);
                for(int i=0;i<num.length()/2;i++)
                {
                    firstNSum+=num.charAt(i)-'0';
                }
                for(int i=num.length()/2;i<num.length();i++)
                {
                    lastNSum+=num.charAt(i)-'0';
                }

                if(firstNSum==lastNSum)
                {
                    count++;
                }
            }
            low++;
        } 
        return count;   
    }
}