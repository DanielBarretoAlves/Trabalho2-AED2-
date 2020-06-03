package app;

public class Stack {
    private Ticket[] tickets;
    private int stackCap;    //Capacity
    private int stackSize;
    private Room[] rooms;

    public Stack(int stackCap, Room[] rooms) {
        this.stackCap = stackCap;
        this.stackSize = 0;
        this.tickets = new Ticket[stackCap];
        this.rooms = rooms;
    }

    public void push(){

    }

    public boolean isEmpity()
    {
        return this.stackSize == 0;
    }

    
}