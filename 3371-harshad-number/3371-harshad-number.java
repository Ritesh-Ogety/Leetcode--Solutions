class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) 
    {
      int sum=0;
      int rem;
      int num=x;
      while(num>0)
      {
        rem=num%10;
        sum+=rem;
        num/=10;
      } 
      
      if(x%sum==0){
        return sum;
      }
      return -1;
    }
}