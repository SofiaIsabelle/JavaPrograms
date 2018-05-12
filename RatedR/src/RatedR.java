import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class RatedR {
    public static void main(String[] args) {
        System.out.println("How old are you ?");

        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Integer integerUserAge = Integer.parseInt(bufferedReader.readLine());
            if(integerUserAge >= 17){
                System.out.println("You can see the movie!");
            }else{
                System.out.println("I'm sorry, you are too young to see the movie.");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

