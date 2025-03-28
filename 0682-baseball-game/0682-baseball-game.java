class Solution 
{
    public int calPoints(String[] operations) 
    {
        Stack <Integer> stack=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("+"))
            {
                int a=stack.pop();
                int b=stack.peek();
                stack.push(a);
                stack.push(a+b);
            }
            else if(operations[i].equals("D"))
            {
                stack.push(2*stack.peek());
            }
            else if(operations[i].equals("C"))
            {
                stack.pop();
            }
            else
            {
                int x=Integer.parseInt(operations[i]);
                stack.push(x);
            }
        }
        int res=0;
        for(int num : stack)
        {
            res+=num;
        }   

        return res;
    }
}