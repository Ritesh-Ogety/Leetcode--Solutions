class Solution {
    public String[] uncommonFromSentences(String s1, String s2)
    {
        String [] s1arr=s1.split(" ");
        String [] s2arr=s2.split(" ");

        HashMap <String,Integer> map=new HashMap<>();
        for(String word: s1arr)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        } 
        for(String word:s2arr)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        List <String> list=new ArrayList<>();
        for(String i: map.keySet())
        {
            if(map.get(i)==1)
            {
                list.add(i);
            }
        }
            String [] res=new String [list.size()];
            for(int i=0;i<list.size();i++)
            {
                res[i]=list.get(i);
            }
            return res;
          
    }
}