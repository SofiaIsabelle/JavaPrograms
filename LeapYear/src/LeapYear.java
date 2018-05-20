public class LeapYear {
    public static void main(String[] args) {
        LeapYear obj = new LeapYear();
        System.out.println(" '1993 is a leap year' is  " + obj.isLeapYear(1993) +".");
        System.out.println(" '1996 is a leap year' is  " + obj.isLeapYear(1996) + ".");
        System.out.println(" '2017 is a leap year' is  " + obj.isLeapYear(2017) +".");
        System.out.println(" '2012 is a leap year' is  " + obj.isLeapYear(2012)+".");

    }

   public boolean isLeapYear(int year){
        if((year % 400 == 0) || (year % 4 == 0 ) && (year % 100 != 0)){
            return true;
        }else{
            return false;
        }
   }
}
