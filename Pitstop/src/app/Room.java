package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Room {

    private int quantity;
    private int roomNumber;
    // TODO: a string movie tem que ser um array de 5 posições e o set dela vai ter
    // que ser diferenciado
    private String[] scenes;

    // TODO: add text reader method inside this class constructor
    public Room(int quantity, int roomNumber, String[] scenes) throws IOException {
        File file = new File("Pitstop/src/movies.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
        this.quantity = quantity;
        this.roomNumber = roomNumber;
        this.scenes = scenes;
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

    // TODO: Simplify toString for better information sharing
    @Override
    public String toString() {
        return "Room [quantity=" + quantity + ", roomNumber=" + roomNumber + "]";
    }

}