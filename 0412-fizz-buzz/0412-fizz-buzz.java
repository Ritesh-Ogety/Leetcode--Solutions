class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList <String> colors=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                colors.add("FizzBuzz");
            }else if(i%3==0){
                colors.add("Fizz");
            }else if(i%5==0){
                colors.add("Buzz");
            }else{
                colors.add(String.valueOf(i));
            }
        }
        return colors;
    }
}