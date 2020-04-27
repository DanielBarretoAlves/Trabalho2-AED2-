package app;

public class Room {

    private int quantity;
    private int roomNumber;
    //TODO: a string movie tem que ser um array de 5 posições e o set dela vai ter que ser diferenciado
    private String[] scene;

    public Room(int quantity, int roomNumber, String[] scene) {
        this.quantity = quantity;
        this.roomNumber = roomNumber;
        this.scene = scene;
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

    //TODO: Simplify toString for better information sharing
    @Override
    public String toString() {
        return "Room [quantity=" + quantity + ", roomNumber=" + roomNumber + "]";
    }



    

}