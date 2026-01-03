package Medias;

public abstract class Media {
    private String title;
    private int year;
    private Genre genre;

    public Media (String title, int year, Genre genre){
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public abstract void showInfo();

    public String getTitle(){
        return title;
    }
}
