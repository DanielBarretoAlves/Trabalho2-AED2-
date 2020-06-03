package app;

import java.util.Arrays;

public class Ticket {
    private Room[] room;
    private String[] movie;

    public Ticket(Room[] room, String[] movie) {
        this.room = room;
        this.movie = movie;
    }

    public Ticket() {
    }

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    public String[] getMovie() {
        return movie;
    }

    public void setMovie(String[] movie) {
        this.movie = movie;
    }

    TODO: A TICKET SÓ PRECISA DO NUMERO DA ROOM N DE TODAS AS ROOMS ENTÃO APGAR A VAR ROOMS E CRIAR UM INT COM O NUMERO DA SALA QUE VAI SETAR DEPOIS

}