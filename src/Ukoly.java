import java.util.Scanner;
public class Ukoly {

    Scanner sc = new Scanner(System.in);

    public void ukol1(){
        int i = 1;
        while (i<=30){
            System.out.println(i+". Ahoj svete");
            i++;
        }
    }

    public void ukol2(){
        System.out.print("Napis slovo: ");
        String slovo = sc.nextLine();
        System.out.println(slovo);
    }

    public void ukol3(){

        System.out.print("Napis cislo: ");
        int i = sc.nextInt();

        if (i<0){
            System.out.println("Bylo zadano zaporne cislo");
        }
        else if (i == 0) {
            System.out.println("0");
        }
        else if (i>12) {
            System.out.println("Moc velke cislo");
        }
        else if (i == 1){
            System.out.println("Jedna");
        }
        else if (i == 2){
            System.out.println("Dva");
        }
        else if (i == 3){
            System.out.println("Tri");
        }
        else if (i == 4){
            System.out.println("Ctyri");
        }
        else if (i == 5){
            System.out.println("Pet");
        }
        else if (i == 6){
            System.out.println("Sest");
        }
        else if (i == 7){
            System.out.println("Sedm");
        }
        else if (i == 8){
            System.out.println("Osm");
        }
        else if (i == 9){
            System.out.println("Devet");
        }
        else if (i == 10){
            System.out.println("Deset");
        }
        else if (i == 11){
            System.out.println("Jedenact");
        }
    }

    public void ukol4(){

        for (int i = 1;i<=20;i++){
            int nasobek = 5*i;
            System.out.println(nasobek);
        }
    }

    public void ukol5(){

    }

    public void ukol6(){

        System.out.print("Napis 1. cislo: ");
        int cislo1 = sc.nextInt();
        System.out.print("Napis 2. cislo: ");
        int cislo2 = sc.nextInt();
        System.out.print("Napis 3. cislo: ");
        int cislo3 = sc.nextInt();

        int max = 1;
        int min = 1;

        if (cislo1>cislo2 && cislo1>cislo3){

            max = cislo1;

            if (cislo2>cislo3){
                min = cislo3;
            }
            else {
                min = cislo2;
            }
        }
        if (cislo3>cislo2 && cislo1<cislo3){

            max = cislo3;

            if (cislo1>cislo2){
                min = cislo2;
            }
            else {
                min = cislo1;
            }
        }
        if (cislo1<cislo2 && cislo2>cislo3){

            max = cislo2;

            if (cislo1>cislo3){
                min = cislo3;
            }
            else {
                min = cislo1;
            }
        }

        System.out.println("Nejvetsi: "+max+" Nejmensi: "+min+" zbytek deleni = "+max%min);

    }

    public void ukol7(){
        System.out.print("Napis jmeno: ");
        String jmeno = sc.nextLine();
        System.out.print("Napis prijmeni: ");
        String prijmeni = sc.nextLine();
        System.out.println("Tvoje jmeno je: "+jmeno+" "+prijmeni);
    }

    public void ukol8(){

        int i = 1;

        while (i == 1) {

            i = 0;
            System.out.println("Napis cislo: ");
            int cislo = sc.nextInt();
            int a = cislo;
            if (a >= 1){
                while(a>=0){
                    System.out.println(a);
                    a--;
                }
            }
            else {
                System.out.println("Musis napsat kladne cislo!!!!");
                i++;
            }
        }
    }

    public void ukol9(){
        int i = 1000;
        while (i>=941) {

            if (i%2 == 1){
                System.out.println(i);
            }

            i--;
        }
    }

    public void ukol10(){

        System.out.print("napis 1. znak: ");
        String znak = sc.nextLine();

        System.out.print("napis 2. znak: ");
        String znak2 = sc.nextLine();

        if (){
            znak = znak2;
        }

        System.out.println(znak);

    }

}
