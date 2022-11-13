
public class Movie {
    private int id;
    private String movie;
    private String genre;
    private String hall;
    private String time;

    public Movie(int id, String movie, String genre, String hall, String time) {
        this.id = id;
        this.movie = movie;
        this.genre = genre;
        this.hall = hall;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}
