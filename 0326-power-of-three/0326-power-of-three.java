class Solution {
    public boolean isPowerOfThree(int n) {
        int ans=0;
        if (n==0 || n<0) return false;
        if(n==1) return true;
        if(n==Integer.MAX_VALUE) return false;
        for(int i=1;i<31;i++)
        {
            ans=(int)Math.pow(3,i);
            if(ans==n){
                return true;
            }
        }
        return false;
    }
}