package app;


public class Room {

    private int quantity;
    private int roomNumber;

    public Room() {
        this.roomNumber = 1;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
   
}



// TODO: A ROOM PODE TER X TICKETS (ARRAY), E CADA TICKET TEM SEU NUMERO GRAVADO PODE SER UMA FILA OU PILHA DE ROOMS QUE VAI DANDO OS TICKET PARA A STACK DE TICKETS