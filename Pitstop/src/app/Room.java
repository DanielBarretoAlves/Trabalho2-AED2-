package app;

import java.io.*;

public class Room {

    private int quantity;
    private int roomNumber;
    // TODO: a string movie tem que ser um array de 5 posições e o set dela vai ter
    // que ser diferenciado
    private String[] scenes = new String[5];

    // TODO: add text reader method inside this class constructor
    public Room(int quantity, int roomNumber) throws IOException {
        //TODO: Setar a quantidade de linhas
        File movies  = new File("Pitstop/src/movies.txt");
        BufferedReader br  = new BufferedReader(new FileReader(movies));
        String st;
        int scenesNumber = 0;
        //TODO: Sort the postions for atribuition
        while ((st= br.readLine()) != null && scenesNumber < this.scenes.length) {
            // System.out.println(st);
            scenes[scenesNumber] = st;
            scenesNumber++;
        }


        this.quantity = quantity;
        this.roomNumber = roomNumber;
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