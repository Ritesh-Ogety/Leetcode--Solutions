class Solution 
{
    public String removeOccurrences(String s, String part) 
    {
        while(s.contains(part))
        {
            //1. firstOccurence --> replaceFirst(String or regex,replacement);
            // 2. lastOccurence --> lastIndexOf(String);

            s=s.replaceFirst(part,"");
        }
        return s;    

    }
}