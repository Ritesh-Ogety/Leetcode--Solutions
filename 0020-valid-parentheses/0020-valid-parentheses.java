class Solution 
{
    public boolean checkPair(char val1,char val2)
    {
        return (val1=='('&&val2==')' || val1=='['&&val2==']'|| val1=='{'&&val2=='}');
    }
    public boolean isValid(String s) 
    {
        Stack <Character> x=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char pchar=s.charAt(i);
            if(pchar=='(' || pchar=='[' || pchar=='{')
            {
                x.push(pchar);
            }
            else
            {
                if(x.isEmpty() || !checkPair(x.peek(),pchar))
                {
                    return false;
                }
                x.pop();
            }
        }
        return x.isEmpty();
    }
    public static void main(String[] args)
    {
        Solution s1=new Solution();
        
        System.out.println(s1.isValid("()"));
    }
}