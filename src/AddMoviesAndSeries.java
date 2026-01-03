import Medias.*;

public class AddMoviesAndSeries {

    public static Streaming createStreaming() {
        Streaming streaming = new Streaming();
        addMovies(streaming);
        addSeries(streaming);

        return streaming;
    }

    public static void addMovies(Streaming streaming) {
        streaming.addMovie
                (new Movie("Interstellar", 2014, Genre.SCIFI, "Christoper Nolan", 169));
        streaming.addMovie
                (new Movie("Carrie", 1976, Genre.HORROR, "Brian De Palma", 98));
        streaming.addMovie
                (new Movie("Avatar", 2009, Genre.SCIFI, "James Cameroun", 162));
        streaming.addMovie
                (new Movie("Between two Ferns", 2019, Genre.COMEDY, "Scott Aukerman", 86));
        streaming.addMovie
                (new Movie("IT", 2017, Genre.HORROR, "Andrés Muschietti", 135));
    }

    public static void addSeries(Streaming streaming) {
        Series strangerThings = (new Series("Stranger Things", 2016, Genre.SCIFI));
        Season season1ST = new Season(1);
        season1ST.addEpisode(new Episode(1, "The Vanishing of Will Byers", 47));
        season1ST.addEpisode(new Episode(2, "The weirdo on Maple Street", 56));
        season1ST.addEpisode(new Episode(4, "The Body", 51));

        Season season2ST = new Season(2);
        season2ST.addEpisode(new Episode(1, "MADMAX", 48));
        season2ST.addEpisode(new Episode(8, "Mind flayer", 48));

        Season season5ST = new Season(5);
        season5ST.addEpisode(new Episode(1, "The Crawl", 71));
        season5ST.addEpisode(new Episode(7, "The Bridge", 66));
        season5ST.addEpisode(new Episode(8, "The Rightside up", 128));
        strangerThings.addSeason(season1ST);
        strangerThings.addSeason(season2ST);
        strangerThings.addSeason(season5ST);

        Series theOffice = (new Series("The Office", 2012, Genre.COMEDY));
        Season season1TO = new Season(1);
        season1TO.addEpisode(new Episode(1, "Pilot", 23));
        season1TO.addEpisode(new Episode(2, "Diversity Day", 22));

        Season season4TO = new Season(4);
        season4TO.addEpisode(new Episode(10, "Branch Wars", 21));
        season4TO.addEpisode(new Episode(11, "Survivor Man", 21));

        Season season8TO = new Season(8);
        season8TO.addEpisode(new Episode(1, "The List", 21));
        season8TO.addEpisode(new Episode(4, "Garden Party", 21));
        theOffice.addSeason(season1TO);
        theOffice.addSeason(season4TO);
        theOffice.addSeason(season8TO);


        Series whiteLotus = (new Series("White Lotus", 2021, Genre.DRAMA));
        Season season1WL = new Season(1);
        season1WL.addEpisode(new Episode(1, "Arrivals", 54));
        season1WL.addEpisode(new Episode(2, "New Day", 57));

        Season season2WL = new Season(2);
        season2WL.addEpisode(new Episode(1, "Ciao", 57));
        season2WL.addEpisode(new Episode(2, "Italian Dream", 54));

        Season season3WL = new Season(3);
        season3WL.addEpisode(new Episode(1, "Same Spirits, New Form", 61));
        season3WL.addEpisode(new Episode(2, "Special Treatments", 61));
        season3WL.addEpisode(new Episode(3, "The Meaning of Dreams", 59));

        whiteLotus.addSeason(season1WL);
        whiteLotus.addSeason(season2WL);
        whiteLotus.addSeason(season3WL);

        streaming.addSeries(strangerThings);
        streaming.addSeries(theOffice);
        streaming.addSeries(whiteLotus);
    }
}
