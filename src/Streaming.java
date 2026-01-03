import Medias.Season;
import Medias.Series;
import Medias.Movie;
import util.TextUI;

import java.util.ArrayList;


public class Streaming {

    private ArrayList<Movie> allMovies = new ArrayList<>();
    private ArrayList<Series> allSeries = new ArrayList<>();
    TextUI ui = new TextUI();

    public void startSession() {

        // findMovie("Carrie");
        // findMovie("Olsenbanden");
        // playMovie("Olsenbanden");
        playEpisode("The Office", 1, 5);

        System.out.println();
        System.out.println("Velkommen til Streaming");
        String choice = showStartMenu();
        handleUsersChoice(choice);
    }

    //*********** METODER TIL AT HÅNDTERE VALG I startSession() **********
    public String showStartMenu(){
        ui.displayMessage("Hvad vil du gerne se i dag? ");
        ui.displayMessage("1. Film");
        ui.displayMessage("2. Serier");
        return ui.textPrompt("Indtast 1 eller 2: ");
    }

    public void handleUsersChoice(String choice){
        switch (choice){
            case "1" -> userPickedMovie();
            case "2" -> userPickedSeries();
            default -> ui.displayMessage("Ugyldigt valg");
        }
    }

    public void userPickedMovie(){
        showAllMoviesWithInfo();
        String usersChoice = ui.textPrompt("Vælg en film fra listen ");
        System.out.println();
        playMovie(usersChoice);
        }

    public void userPickedSeries(){
        showAllSeriesWithInfo();
        String usersChoice = ui.textPrompt("Vælg en serie fra listen");
        int season = Integer.parseInt(ui.textPrompt("Vælg en sæson: "));

        for (Series serie : allSeries){
            if (serie.getTitle().equalsIgnoreCase(usersChoice)){
                for (Season s : serie.getSeasons())
                    if (s.getSeasonNumber() == season)
                        s.showEpisodes();
            }
        }
        int episode = Integer.parseInt(ui.textPrompt("Vælg en episode fra listen: "));
        System.out.println();
        playEpisode(usersChoice, season, episode);
    }


    //*********** METODER TIL AT VISE INFO **********
    public void showAllMoviesWithInfo(){
        System.out.println();
        System.out.println("\nAlle film: \n");
        for (Movie movie : allMovies) {
            movie.showInfo();
        }
    }

    public void showAllSeriesWithInfo(){
        System.out.println();
        System.out.println("\nAlle serier: \n");
        for (Series serie : allSeries){
            serie.showInfo();
        }
    }


    //*********** METODER TIL AT FIND OG TILFØJE MEDIA **********
    public void addMovie (Movie movie){
        allMovies.add(movie);
    }

    public void addSeries (Series series){
        allSeries.add(series);
    }

    public void findMovie (String title){
        for (Movie movie : allMovies){
            if (movie.getTitle().equalsIgnoreCase(title)){
                movie.showInfo();
                return;
            }
        }
        System.out.println("\nFilmen findes ikke\n");
    }

    //*********** METODER TIL AT AFSPILLE **********
    public void playEpisode (String seriesTitle, int seasonNumber, int episodeNumber){
        for (Series s : allSeries){
            if (s.getTitle().equalsIgnoreCase(seriesTitle)){
                s.playEpisode(seasonNumber, episodeNumber);
                return;
            }
        }
        System.out.println("Serie ikke fundet: " + seriesTitle);
    }

    public void playMovie(String movieTitle){
        for (Movie m : allMovies){
            if (m.getTitle().equalsIgnoreCase(movieTitle)){
                //m.showInfo();
                m.play();
                return;
            }
        }
        System.out.println("Film ikke fundet: " + movieTitle);
    }

}

