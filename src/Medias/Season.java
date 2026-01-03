package Medias;

import java.util.ArrayList;

public class Season {
    private int seasonNumber;
    private ArrayList<Episode> episodes = new ArrayList<>();

    public Season(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public void showEpisodes() {
        System.out.println("Afsnit: " + seasonNumber + ": ");
        for (Episode episode : episodes) {
            episode.showInfo();
        }
    }

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    public void playEpisode(int episodeNumber) {
        for (Episode episode : episodes) {
            if (episode.getEpisodeNumber() == episodeNumber) {
                episode.play();
                return;
            }
        }
        System.out.println("Episoden du leder efter, findes ikke");
    }


    public int getEpisodeCount() {
        return episodes.size();
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }
}

