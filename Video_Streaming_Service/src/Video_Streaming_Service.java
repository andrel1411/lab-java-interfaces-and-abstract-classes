// Abstract class Video
abstract class Video {
    private String title;
    private int duration;

    // Constructor
    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    // Abstract method to get information about the video
    public abstract String getInfo();
}

// TvSeries class extending Video
class TvSeries extends Video {
    private int episodes;

    // Constructor
    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    // Getter
    public int getEpisodes() {
        return episodes;
    }

    // Implementation of getInfo() method
    @Override
    public String getInfo() {
        return "TV Series [Title: " + getTitle() + ", Duration: " + getDuration() + " minutes, Episodes: " + episodes + "]";
    }
}

// Movie class extending Video
class Movie extends Video {
    private double rating;

    // Constructor
    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    // Getter
    public double getRating() {
        return rating;
    }

    // Implementation of getInfo() method
    @Override
    public String getInfo() {
        return "Movie [Title: " + getTitle() + ", Duration: " + getDuration() + " minutes, Rating: " + rating + "]";
    }
}

// Main class to test the Video Streaming Service
public class Video_Streaming_Service {
    public static void main(String[] args) {
        TvSeries tvSeries = new TvSeries("Breaking Bad", 3600, 62);
        Movie movie = new Movie("Inception", 148, 8.8);

        System.out.println(tvSeries.getInfo());
        System.out.println(movie.getInfo());
    }
}
