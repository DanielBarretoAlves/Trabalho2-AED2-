package app;

public class Ticket {
    private Room room;
    private Pessoa person;

    public Ticket(Room room) {
        this.room = room;
        this.person = null;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Pessoa getPerson() {
        return person;
    }

    public void setPerson(Pessoa person) {
        this.person = person;
    }

    
    

    
    
}