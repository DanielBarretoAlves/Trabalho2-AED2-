package app;

public class Room {
    private int space;
    private int people;
    private String movies;
    private int roomNumber;

    public Room()
    {
        setMovies();
        this.people=0;
        this.space=20;
    }

    public int getSpace() {
        return space;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getMovies() {
        return movies;
    }

    //TODO: make a real setMovies
    public void setMovies() {
        this.movies = "movieA, movieB, movieC, movieD";
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
}