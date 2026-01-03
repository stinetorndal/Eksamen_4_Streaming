package Medias;

public class Episode implements Playable{
    private int episodeNumber;
    private String titleOfEpisode;
    private int lengthOfEpisode;

    public Episode (int episodeNumber, String titleOfEpisode, int lengthOfEpisode){
        this.episodeNumber = episodeNumber;
        this.titleOfEpisode = titleOfEpisode;
        this.lengthOfEpisode = lengthOfEpisode;
    }

    public int getEpisodeNumber(){
        return episodeNumber;
    }

    @Override
    public void play(){
        System.out.println("Afspiller nu afsnit: " + episodeNumber + ": " + titleOfEpisode);
    }

    public void showInfo(){
        System.out.println(episodeNumber + " | " + titleOfEpisode + " | " + lengthOfEpisode + " minutter");
    }
}
