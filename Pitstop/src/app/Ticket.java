package app;

public class Ticket {
    private Room room;
    private Person uData; // aqui só vai armazenar uma copia da pessoa para ter os dados dela

    public Ticket(Room room) {
        this.room = room;
    }

    public Ticket(Room room, Person uData) {
        this.room = room;
        this.uData = uData;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Person getuData() {
        return uData;
    }

    public void setuData(Person uData) {
        this.uData = uData;
    }

}