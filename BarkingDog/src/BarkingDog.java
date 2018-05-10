public class BarkingDog {

    public static void main(String[] args){

    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if(((hourOfDay >= 0 && hourOfDay <= 23) && (hourOfDay < 8 || hourOfDay > 22))&& barking)
            return true;
            else
                return false;
      }
    }