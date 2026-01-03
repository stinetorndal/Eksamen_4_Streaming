package Medias;

import java.util.ArrayList;

public class Series extends Media{

    private ArrayList<Season> seasons = new ArrayList<>();

    public Series (String title, int year, Genre genre){
        super (title, year, genre);
    }

    public void addSeason (Season season){
        seasons.add(season);
    }

    public int getTotalNumberOfEpisodes(){
        int total = 0;
        for (Season season: seasons){
            total += season.getEpisodeCount();
        }
        return total;
    }

    public int getNumberOfSeasons(){
        return seasons.size();
    }

    public void showSeasons(){
        System.out.println("Sæsoner: ");
        for (Season season: seasons){
            System.out.println(season.getSeasonNumber() + " ");
        }
        System.out.println();
    }

    public void playEpisode (int seasonNumber, int episodeNumber){
        for (Season season : seasons){
            if (season.getSeasonNumber() == seasonNumber){
                season.playEpisode(episodeNumber);
                return;
            }
        }
        System.out.println("Sæsonen findes ikke ");
    }
    @Override
    public void showInfo(){
        System.out.println("Serie: " + getTitle());
        System.out.println("Antal sæsoner: " + getNumberOfSeasons());
        System.out.println("Antal episoder: " + getTotalNumberOfEpisodes());
        showSeasons();
        System.out.println("************************");
    }

    public ArrayList <Season> getSeasons(){
        return seasons;
    }
}

