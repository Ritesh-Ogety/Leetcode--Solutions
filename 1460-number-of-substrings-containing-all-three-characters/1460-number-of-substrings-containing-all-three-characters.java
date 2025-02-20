class Solution 
{
    public int numberOfSubstrings(String s) 
    {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int count=0;

        while(right<n)
        {
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);

            while(map.getOrDefault('a',0)>0 && map.getOrDefault('b',0)>0 && map.getOrDefault('c',0)>0)
            {
                count+=n-right;
                map.put(s.charAt(left),map.get(s.charAt(left)) -1);
                left++;
            }
            right++;
        }
        return count;    
    }
}