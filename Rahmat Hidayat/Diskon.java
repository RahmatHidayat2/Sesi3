public class Diskon {
    Run |Debug
    public static void main(String[] args) throws Exception{
        int diskon = 10;
        int belanja = 200000;

        if (belanja > 20000){
            diskon = 10*belanja/100;
        }
        int totalbayar = belanja - diskon;
        System.out.println("totalbayar :" +totalbayar);

    }