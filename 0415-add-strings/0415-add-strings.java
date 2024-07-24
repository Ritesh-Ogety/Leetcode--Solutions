import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger val1=new BigInteger(num1);
        BigInteger val2=new BigInteger(num2);
        BigInteger sum=val1.add(val2);
        return sum.toString();
    }
}