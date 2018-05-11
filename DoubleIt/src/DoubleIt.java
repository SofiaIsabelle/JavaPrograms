import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleIt {
    public static void main(String[] args) {
        System.out.println("Give me a number, and I will double it for you !");

        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String stringNumber = bufferedReader.readLine();
            Integer yourNumber = Integer.parseInt(stringNumber);
            Integer yourDoubleNumber = yourNumber * 2;

            System.out.println(" I doubled your number for you: " + yourDoubleNumber + " !");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}


// Integer.parseInt(String stringNumber) takes a String and transforms it to an Integer
// Likewise Integer.toString(Integer yourDoubleNumber) takes an integer and makes it into a String
// so that we can concatenate it with the string " I doubled your number for you : "
//The same way we can use Integer.parseInt, we can also use
// Boolean.parseBoolean and
// Float.parseFloat to do similar operations. They work the same way.