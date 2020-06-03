package app;
//TODO: Comment all Methdos

public class Stack extends List {
    //TODO: Add Log Attribute
    
    public Stack()
    {
        super();
    }
    //TODO: Add Get Todo

    //TODO: Add Set Log Inside all elements
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