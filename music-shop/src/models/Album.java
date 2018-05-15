package models;

public class Album {

    public String genre;
    public String artist;
    public String title;
    public int release_year;
    public int price;

    public Album(String genre, String artist, String title, int release_year, int price ) {
        this.genre = genre;
        this.artist = artist;
        this.title = title;
        this.release_year = release_year;
        this.price = price;

    }


    public boolean musicPick(String userPick){
        return (userPick.equals(this.genre));
    }

}
