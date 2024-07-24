import java.util.LinkedList;
import java.util.Queue;
class MyStack {

    Queue <Integer>q1;
    Queue <Integer>q2;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
        
        
    }
    
    public void push(int x) {
        while(!q1.isEmpty())
        {
            q2.add(q1.remove());
        }
        q1.add(x);
        while(!q2.isEmpty())
        {
           q1.add(q2.remove());
        }
        
    }
    
    public int pop() {
        if(!q1.isEmpty())
        {
            // throw new IllegalStateException("Stack is Empty");
            System.out.println("Stack is empty");
        }
        return q1.remove();
        
    }
    
    public int top() {
        if(q1.isEmpty())
        {
            // throw new IllegalStateException("Stack is empty");
             System.out.println("Stack is empty");
        }
        return q1.peek();

        
    }
    
    public boolean empty() {
        return q1.isEmpty();
        
    }

    public static void main(String[] args)
    {
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        int param_3 = obj.top();
        System.out.println(param_3);
        int param_2 = obj.pop();
        System.out.println(param_2);
        boolean param_4 = obj.empty();
       

    }
}


//  /* Your MyStack object will be instantiated and called as such:
//  * MyStack obj = new MyStack();
//  * obj.push(x);
//  * int param_2 = obj.pop();
//  * int param_3 = obj.top();
//  * boolean param_4 = obj.empty();
//  */