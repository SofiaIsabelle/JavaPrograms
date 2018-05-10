public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1);
        printMegaBytesAndKiloBytes(2);
        printMegaBytesAndKiloBytes(3);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes >= 0){
            System.out.println(kiloBytes + "KB = " + kiloBytes/1024 + " MB" + kiloBytes%1024 + " KB");
        }
        else{
            System.out.println("Invalid Value");
        }
    }

}
