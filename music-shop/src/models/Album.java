package models;

public class Album {
    public static String genre;
    public String artist;
    public String title;
    public int release_year;
    public int price;


    public boolean musicPick(String userPick){
        return (genre == userPick);
    }

}
