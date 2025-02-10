class Solution 
{
    public String clearDigits(String s) 
    {
           StringBuilder sb=new StringBuilder();

           for(int i=0;i<s.length();i++)
           {
                char pchar=s.charAt(i);
                if(Character.isDigit(pchar))
                {
                    sb.deleteCharAt(sb.length()-1);  
                }
                else
                {
                    sb.append(pchar);
                }
           }

        return sb.toString();
    }
}
