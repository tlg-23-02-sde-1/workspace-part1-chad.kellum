package net.flix.client;

import net.flix.Genre;
import net.flix.Movie;
import net.flix.Rating;

class MovieClient {

    public static void main(String[] args) {
       Movie movie1 = new Movie("Shrek");
       movie1.setReleaseYear(2005);
       movie1.setRevenue(491_800_000.03);
       movie1.setRating(Rating.PG);
       movie1.setGenre(Genre.COMEDY);
       System.out.println(movie1);

       Movie movie2 = new Movie("The Labyrinth", Genre.SCI_FI, 1986, 20.0, Rating.PG);
       System.out.println(movie2);

       Movie movie3 = new Movie("Vacation in Java", Genre.HORROR);
       System.out.println(movie3);

       Movie movie4 = new Movie("Star Wars: A New Hope", Genre.SCI_FI,1977, 1500000000.50, Rating.PG);
       System.out.println(movie4);
    }


}