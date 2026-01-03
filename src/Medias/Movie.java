package Medias;

public class Movie extends Media implements Playable{
    private String director;
    private int length;

    public Movie (String title, int year, Genre genre, String director, int length){
        super(title, year, genre);
        this.director = director;
        this.length = length;
    }

    @Override
    public void play(){
        System.out.println("Afspiller nu film: " + getTitle());
    }

     @Override
    public void showInfo(){
         System.out.println("************************");
         System.out.println("Film: " + getTitle());
         System.out.println("Instruktør: "+ director);
         System.out.println("Længde: " + length + " minutter");
     }
}
