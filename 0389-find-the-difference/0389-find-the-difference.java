class Solution {
    public char findTheDifference(String s, String t) {
        
        char [] sarr=s.toCharArray();
        char [] tarr=t.toCharArray();

        Arrays.sort(sarr);
        Arrays.sort(tarr);

        int i=0;
        int j=0;

        while(i<sarr.length && j<tarr.length)
        {
            if(sarr[i]!=tarr[j])
            {
                return tarr[j];
            }
            i++;
            j++;
        }
        return tarr[j];
    }
}