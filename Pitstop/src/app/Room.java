package app;

public class Room {

    private int quantity;
    private String roomNumber;
    //TODO: a string movie tem que ser um array de 5 posições e o set dela vai ter que ser diferenciado
    private String movie;

    public Room(int quantity, String roomNumber) {
        this.quantity = quantity;
        this.roomNumber = roomNumber;
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

    @Override
    public String toString() {
        return "Room [quantity=" + quantity + ", roomNumber=" + roomNumber + "]";
    }



    

}