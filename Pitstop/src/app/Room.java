package app;


public class Room {

    private int quantity;
    private int roomNumber;
    private String movies;

    public Room(int quantity, int roomNumber, String movies) {
        this.quantity = quantity;
        this.roomNumber = roomNumber;
        this.movies = movies;
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

    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }

    
    
   
}



// TODO: A ROOM PODE TER X TICKETS (ARRAY), E CADA TICKET TEM SEU NUMERO GRAVADO PODE SER UMA FILA OU PILHA DE ROOMS QUE VAI DANDO OS TICKET PARA A STACK DE TICKETS