package app;

public class Node {

    private Ticket ticket;
    private Node next;

    public Node(Ticket ticket) {
        this.ticket = ticket;
        this.next = null;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    

}