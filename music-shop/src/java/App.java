import models.Album;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) {

        Album latin = new Album("latin", "Shakira", "Laundry Service", 2001, 22);
        Album rock = new Album("rock", "Green Day", "American Idiot", 2004, 25);
        Album rap = new Album("rap", "Eminem", "Encore", 2002, 20);
        Album pop = new Album("pop", "The Beatles", "Help!", 1995, 15);

        Album[] allAlbums = {latin, rock, rap, pop};

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Which genre of music would you be interested in? Enter one of the following options: All Albums or Genre");


        try {

            String navigationChoice = bufferedReader.readLine();

            if (navigationChoice.equals("All Albums")) {
                for (Album individualAlbum : allAlbums) {
                    System.out.println("---------------------------");
                    System.out.println(individualAlbum.genre);
                    System.out.println(individualAlbum.artist);
                    System.out.println(individualAlbum.title);
                    System.out.println(individualAlbum.release_year);
                    System.out.println(individualAlbum.price);
                }
            } else if (navigationChoice.equals("Genre")) {
                
                System.out.println("Which genre of music is your pick : latin, rock, pop, or rap ?");
                String stringGenreOfChoice = bufferedReader.readLine();
                String userGenreOfChoice = stringGenreOfChoice;

                System.out.println("Alright, here's what we have for your genre of choice :");
                for (Album individualAlbum : allAlbums) {
                    if (individualAlbum.musicPick(userGenreOfChoice)) {
                        System.out.println("-------------------------------");
                        System.out.println(individualAlbum.genre);
                        System.out.println(individualAlbum.artist);
                        System.out.println(individualAlbum.title);
                        System.out.println(individualAlbum.release_year);
                        System.out.println(individualAlbum.price);
                    }
                }


            } else {
                System.out.println("I'm sorry , we don't recognize your input.");
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}


