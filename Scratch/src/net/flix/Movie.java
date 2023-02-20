package net.flix;

public class Movie {
    // FIELDS or INSTANCE VARIABLES
    private String  title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // constructors (Every class must have at least one constructor.)
    // If you don't write one, then the compiler creates one for you.


    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }
    public Movie(String title, Genre genre,Integer releaseYear, Double revenue, Rating rating){
        this(title, genre);
        setReleaseYear(releaseYear);
        setRevenue(revenue);
        setRating(rating);
    }

// BUSINESS-ORIENTED METHODS

    //play(), pause(), stop(), rewind,


//ACCESSOR METHODS (get/set methods


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return String.format("net.flix.Movie: title= %s, releaseYear= %s,revenue= %,.2f, rating= %s, genre= %s\n", getTitle(),
                 getReleaseYear(), getRevenue(), getRating(), getGenre());
    }
}