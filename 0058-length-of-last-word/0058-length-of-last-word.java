class Solution 
{
    public int lengthOfLastWord(String s)
    {
        String S=s.trim();
        String [] words=S.split(" +");
        String x=new String(words[words.length-1]);
        int count=0;
        for(int i=0;i<x.length();i++)
        {
            count++;
        }
        return count;
    }


    public static void main(String[] args)
    {
        String str="Hello World";
        Solution s1=new Solution();
        System.out.println(s1.lengthOfLastWord(str));
    }




}