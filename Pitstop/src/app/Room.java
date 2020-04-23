package app;

public class Room {

    private int quantity;
    private String roomNumber;
    //TODO: a string movie tem que ser um array de 5 posições e o set dela vai ter que ser diferenciado
    private String movie;

    public Room(int quantity, String roomNumber, String movie) {
        this.quantity = quantity;
        this.roomNumber = roomNumber;
        this.movie = movie;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Room [movie=" + movie + ", quantity=" + quantity + ", roomNumber=" + roomNumber + "]";
    }

    

}