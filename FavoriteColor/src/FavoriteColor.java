import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FavoriteColor {
    public static void main(String[] args) {
        System.out.println("What is your favorite color ?");

        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputString = bufferedReader.readLine();

            System.out.println("Your favorite colors are  " + inputString + " ? They're my favorite colors too!");
        }

        catch(IOException e){
            e.printStackTrace();
        }
    }

}


/* Place the cursor next or on top of the code you see in red underlining , then press alt + enter  in order to import the necessary code that Java needs to run the methods. */