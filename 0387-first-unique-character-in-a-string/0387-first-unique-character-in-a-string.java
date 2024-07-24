class Solution 
{
    public int firstUniqChar(String s) 
    {
        char [] arr=s.toCharArray();
        boolean isNonRepetetive=false;
        for(int i=0;i<arr.length;i++)
        {
            boolean repetetive=false;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    repetetive=true;
                    break;
                }
            }
            if(!repetetive)
            {
                return i;
                //isNonRepetetive=true;
                //break;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Solution s1=new Solution();
        System.out.println(s1.firstUniqChar("leetcode"));
    }
}