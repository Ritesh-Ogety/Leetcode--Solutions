class Solution 
{
    public String reverseOnlyLetters(String s) 
    {
        int n=s.length();
        Stack <Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char pchar=s.charAt(i);
            if(pchar>='a'&& pchar<='z' || pchar>='A'&& pchar<='Z')
            {
                stack.push(pchar);
            }            
        }
        for(int i=0;i<n;i++)
        {
            char pchar=s.charAt(i);
            if(pchar>='a'&& pchar<='z' || pchar>='A'&& pchar<='Z')
            {
                sb.append(stack.pop());
            }
            else
            {
                sb.append(pchar);
            }
        }
        return sb.toString();
    }
}