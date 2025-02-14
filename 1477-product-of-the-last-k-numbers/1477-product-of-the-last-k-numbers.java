class ProductOfNumbers {
    ArrayList <Integer> al=new ArrayList<>();
    int product=1;
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        if(num==0)
        {
            al=new ArrayList<>();
            product=1;
            return;
        }
        product*=num;
        al.add(product);
    }
    
    public int getProduct(int k) {

        if(al.size()<k)
        {
            return 0;
        }
        int ans=al.get(al.size()-1);
        if(al.size()==k) return ans;

        return ans/al.get(al.size()-1-k);
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */