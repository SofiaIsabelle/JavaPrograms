public class isLeapYear {

    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year){
        if((year >= 1 && year <= 999)){
            if(((year % 4)==0 && (year % 100) > 0) || (year % 400)==0){
                return true;
            }
        }
        return false;
    }


}



/* Notes :
            A year is a leap year if it is divisible by 4, but not by 100, or it is divisible by 400.
 */