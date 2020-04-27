package app;
//TODO: Add Comentarios que explicam todos os metodos
import java.util.Random;

public class Ticket {

    private Room[] room;
    private String[] movie;

    public Ticket() {
        setRoom();
    }

    public Room[] getRoom() {
        return room;
    }

    private void setRoom() {
        Random ran = new Random();
        String[] filmes = {"Avengeiros", "Carreta furacão the movie", "Topzera movie", "movie Alone", "Doidera"};
        int nxt = ran.nextInt(5); 
        String t = filmes[nxt];
        this.movie = filmes;
        room = new Room[5];
        for (int i = 0; i < 5; i++) {
            String[] scenes = new String[5];
            for (int j = 0; j < scenes.length; j++) {
                scenes[j] = t;
            }
            Room r = new Room(15, i+1, scenes);
            room[i] = r;
        }

    }
    //TODO: apagar ou adaptar esse metodo comentado
    // public String showTicket(){

    //     for (int i = 0; i < room.length; i++) {
    //         room[i];
    //     }
    //     return null;
    // }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    //TODO: Adaptar o ToString para melhor compreensão e compartilhamento das Informações
    @Override
    public String toString() {
        return "Ticket [movie=" + movie + ", room=" + room + "]";
    }

    

}