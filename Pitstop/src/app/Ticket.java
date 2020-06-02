package app;

public class Ticket {
    private Room room;

    public Ticket(Room room) {
        this.room = room;
    }

    public Ticket() {
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    
}