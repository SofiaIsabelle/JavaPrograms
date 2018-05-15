import models.Album;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Which genre of music would you be interested in ?");


        try {

            String stringUserMusicPick = bufferedReader.readLine();

            Album latin = new Album();
            latin.genre = "latin";
            latin.artist = "Shakira";
            latin.title = "Laundry Service";
            latin.release_year = 2001;
            latin.price = 22;


            Album rock = new Album();
            rock.genre = "rock";
            rock.artist = "Green Day";
            rock.title = "American Idiot";
            rock.release_year = 2004;
            rock.price = 25;


            Album rap = new Album();
            rap.genre = "rap";
            rap.artist = "Eminem";
            rap.title = "Encore";
            rap.release_year = 2004;
            rap.price = 20;


            Album pop = new Album();
            pop.genre = "pop";
            pop.artist = "The Beatles";
            pop.title = "Help";
            pop.release_year = 1965;
            pop.price = 15;


            Album[] allAlbums = {latin, rock, rap, pop};
            String userMusicPick = stringUserMusicPick;
            System.out.println("Here is the album that we have for the genre of your choice :  ");

            for (Album individualAlbum : allAlbums) {
               /* if (individualAlbum.userMusicPick(userMusicPick)) { */
                if (individualAlbum.musicPick(userMusicPick)) {
                    System.out.println("------------------------------");
                    System.out.println(individualAlbum.genre);
                    System.out.println(individualAlbum.artist);
                    System.out.println(individualAlbum.title);
                    System.out.println(individualAlbum.release_year);
                    System.out.println(individualAlbum.price);

                }
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}

