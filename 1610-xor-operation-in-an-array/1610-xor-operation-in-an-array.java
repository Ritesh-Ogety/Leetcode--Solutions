class Solution {
    public int xorOperation(int n, int start) {
        int [] arr=new int[n];
        int xor=start;
        for(int i=1;i<n;i++)
        {
            arr[i]=start+2*i;
        }
        for(int i=1;i<n;i++){
            xor=xor^arr[i];
        }
        return xor;
    }
}