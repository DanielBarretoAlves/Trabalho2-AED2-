package app;

import java.io.*;
import java.util.Random;

public class Room {

    private int quantity;
    private int roomNumber;
    // TODO: a string movie tem que ser um array de 5 posições e o set dela vai ter
    // que ser diferenciado
    private String[] scenes = new String[5];

    // TODO: add text reader method inside this class constructor
    public Room(int quantity, int roomNumber) throws IOException {
        Random r = new Random();
        File movies = new File("Pitstop/src/movies.txt");
        BufferedReader br = new BufferedReader(new FileReader(movies));
        String st;
        int scenesNumber = 0;
        // TODO: Sort the postions for atribuition A FORMA MAIS BURRA DE TODAS MAS VAI
        // FUNCIONAR DEPOIS ARRUMO
        //TODO: 2 Whiles e um for pra fazer isso, da pra melhorar mas ainda n sei como
        int numFilmes = 0;
        String lt;
        while ((lt = br.readLine()) != null) {
            numFilmes++;
        }
        String[] allMovies = new String[numFilmes];
        while ((st = br.readLine()) != null) {
            allMovies[scenesNumber] = st;
            scenesNumber++;
        }
        //Esse for add 5 filmes aleatorios dentro de scenes
        for (int i = 0; i < scenes.length; i++) {

            scenes[i] = allMovies[r.nextInt(numFilmes)];
        }
        // -----------------------------------------------------------------------------------------------------

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