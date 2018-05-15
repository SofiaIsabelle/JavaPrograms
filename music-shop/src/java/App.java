

import models.Album;

public class App {
    public static void main(String[] args) {
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
        System.out.println("All Albums: ");

        for(Album individualAlbum : allAlbums){
            System.out.println("------------------------------");
            System.out.println(individualAlbum.genre);
            System.out.println(individualAlbum.artist);
            System.out.println(individualAlbum.title);
            System.out.println(individualAlbum.release_year);
            System.out.println(individualAlbum.price);

        }


    }
}

