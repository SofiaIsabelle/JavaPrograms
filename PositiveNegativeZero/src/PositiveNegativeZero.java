public class PositiveNegativeZero {
    //add a main method to test the code that we're running

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-13);
        checkNumber(0);
    }
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        } else if(number < 0){
            System.out.println("negative");
        }else if(number == 0){
            System.out.println("zero");
        }
    }
}
