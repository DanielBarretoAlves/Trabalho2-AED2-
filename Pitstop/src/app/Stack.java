package app;

public class Stack extends List {
    
    public Stack()
    {
        super();
    }
    
    public void stackUP(Ticket t)
    {
        super.insertLast(t);
    }
    public void showStack()
    {
        String stack = super.printList();
        System.out.println(stack);
    }
    public void unstack()
    {
        super.removeNode();
    }

}