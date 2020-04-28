package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Room {

    private int quantity;
    private int roomNumber;
    // TODO: a string movie tem que ser um array de 5 posições e o set dela vai ter
    // que ser diferenciado
    private String[] scenes = new String[5];

    // TODO: add text reader method inside this class constructor
    public Room(int quantity, int roomNumber, String[] scenes) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));
        String line = null;
        String[] values;
        //TODO: Setar a quantidade de linhas
        while ((line = br.readLine()) != null) {
             values = line.split(",");
        }
        for (int i = 0; i < scenes.length; i++) {
            scenes[i] = values[i];
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