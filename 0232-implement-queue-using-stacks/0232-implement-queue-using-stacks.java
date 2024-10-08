class MyQueue {

    Stack <Integer>s1;
    Stack<Integer>s2;

    public MyQueue() {
        s1=new <Integer> Stack();
        s2=new <Integer> Stack();
        
    }
    
    public void push(int x) {

        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(x);

        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        
    }
    
    public int pop() {
        return s1.pop();
        
    }
    
    public int peek() {
        return s1.peek();
        
    }
    
    public boolean empty() {
        return s1.isEmpty();
        
    }

    public static void main(String[] args)
    {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.peek();
        obj.pop(); 
        obj.empty();

    }
}

 