class Solution 
{
    public int countGoodTriplets(int[] arr, int a, int b, int c) 
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    int val1=Math.abs(arr[i]-arr[j]);
                    int val2=Math.abs(arr[j]-arr[k]);
                    int val3=Math.abs(arr[i]-arr[k]);
                    if(val1<=a && val2<=b && val3<=c)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }



    public static void main(String[] args)
    {
        int [] arr={3,0,1,1,9,7};
        Solution s1=new Solution();
        System.out.println(s1.countGoodTriplets(arr,7,2,3));
    }
}