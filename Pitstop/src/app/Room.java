package app;

public class Room {
    private int space = 20;
    private int people = 0;
    private String movies;
    private int roomNumber;

    public Room() {
        setMovies();

    }

    public int getSpace() {
        return space;
    }

    public int getPeople() {
        return people;
    }

    public String getMovies() {
        return movies;
    }

    // TODO: make a real setMovies
    public void setMovies() {
        this.movies = "movieA, movieB, movieC, movieD";
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    //TODO: add People
    public boolean addPeople() {
        if (isFull()) {
            return false;
        }
        people++;
        return true;
    }

    public boolean isFull()
    {
        return people > space;
    }
    public boolean isEmpity()
    {
        return people <= 0;
    }
    //VOU PASSAR POR TODAS AS ROOMS VOU VER SE DA PRA ADD ROOM SE N DER VOU PARA PROXIMA

}