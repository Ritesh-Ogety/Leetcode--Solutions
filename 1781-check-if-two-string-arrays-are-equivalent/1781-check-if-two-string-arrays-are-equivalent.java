class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        for(String x:word1){
            s1+=x;
        }
        for(String y:word2){
            s2+=y;
        }
        return s1.equals(s2);
    }
}