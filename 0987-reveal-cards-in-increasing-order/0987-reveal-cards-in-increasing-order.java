class Solution {
    public int[] deckRevealedIncreasing(int[] deck) 
    {
        Queue <Integer> q1=new LinkedList<>();
        int [] res=new int [deck.length];
        Arrays.sort(deck);
        for(int i=0;i<res.length;i++)
        {
            q1.offer(i);
        }
        for(int i=0;i<deck.length;i++)
        {
            res[q1.poll()]=deck[i];
            q1.offer(q1.poll());
        }
        return res;    
    }
}

