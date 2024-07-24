
class Solution {

    public List<Integer> addToArrayForm(int[] arr, int k) {
        int n = arr.length;
        int c = 0;
        List<Integer> ans = new ArrayList<>();
        String x = String.valueOf(k);
        int idx = x.length()-1;
        for(int i=n-1; i>=0; i--){
            int a = arr[i];
            int b = (idx>=0) ? x.charAt(idx--)-48 : 0;
            int s = a+b+c;
            if(s>=10){
                c = s/10;
                ans.add(0,s%10);
            }else{
                ans.add(0,s);
                c=0;
            }
        }

        if(x.length()>arr.length){
            while(idx>=0){
                int b = x.charAt(idx--)-48;
                int s = b+c;
                if(s>=10){
                    c = s/10;
                    ans.add(0,s%10);
                }else{
                    ans.add(0,s);
                    c=0;
                }
            }
        }
        if(c!=0){
            ans.add(0,c);
        }
        return ans;
    }
}