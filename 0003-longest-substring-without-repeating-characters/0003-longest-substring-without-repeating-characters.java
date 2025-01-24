class Solution 
{
    public int lengthOfLongestSubstring(String s)
    {

        int maxLength=0;
        int n=s.length();
        int left=0;

        Set <Character> charSet=new HashSet<>();

        for(int right=0;right<n;right++)
        {
            char pchar=s.charAt(right);
            if(!charSet.contains(pchar))
            {
                charSet.add(pchar);
                maxLength=Math.max(maxLength,right-left+1);
            }
            else 
            {
                while(charSet.contains(pchar))
                {
                    charSet.remove(s.charAt(left));
                    left++;
                    
                }
                charSet.add(pchar);
            }
        }
        return maxLength;
    }
}