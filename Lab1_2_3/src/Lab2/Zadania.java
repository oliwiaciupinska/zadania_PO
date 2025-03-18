package Lab2;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Zadania {
    public static void zad1() {
        Scanner scan = new Scanner(System.in);
        double lPkt, suma = 0;
        int a = 0;
        System.out.println("Podaj ilosc studentów");
        int n = scan.nextInt();
        int ile_stud = n;
        if (n < 0) System.out.println("liczba studentow w grupie nie moze byc < 0!");
        else {
            while (n > 0) {
                System.out.println("Podaj ilosc punktow dla studenta " + (a + 1) + " z przedzialu [0,10]: ");
                lPkt = scan.nextDouble();
                if (lPkt >= 0 && lPkt <= 10) {
                    suma += lPkt;
                    n--;
                    a++;
                } else {
                    System.out.println("Podaj liczbę ponownie");
                }
            }
            double srednia = suma / ile_stud;
            String srednia_str=String.format("%.2f", srednia);
            System.out.println("Średnia ilosc pkt: " + srednia_str);


        }
    }

    public static void zad2() {
        System.out.println("Program wczytuje 10 liczb i wyznacza ilość oraz sume liczb ujemnych i dodatnich podanych przez użytkownika");
        Scanner scan = new Scanner(System.in);
        int n = 1, iloscu = 0, iloscd = 0;
        double sumd = 0, sumu = 0, liczbal;

        for (int i = 1; i < 11; i++) {
            System.out.println("Podaj element numer " + n);
            n++;
            liczbal = scan.nextDouble();
            if (liczbal >= 0) {
                iloscd++;
                sumd += liczbal;
            } else {
                iloscu++;
                sumu += liczbal;
            }

        }
        System.out.println("ilosc dodatnich elementów =" + iloscd + "\nsuma dodatnich elementów = " + sumd + "\nilosc elementów ujemnych = " + iloscu + "\n suma elementów ujemnych = " + sumu);
    }

    public static void zad3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Program wyswietla sume wszystkich liczb parzystych w danym ciagu");
        System.out.println("Podaj ilu wyrazowy jest ciag n");
        int n = scan.nextInt();
        int sumap = 0;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {

                if (i % 2 == 0) {
                    sumap += i;
                }
            }
        } else {
            System.out.println("N jest mniejsze od zera");
        }
        System.out.println("Suma wyrazów parzystych ciagu wynosi: " + sumap);
    }

    public static void zad4() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Program sluzy do losowania licz z przedzialu (-10,45)");
        System.out.println("Podaj ilosc liczb do wylosowania.");
        int n = scan.nextInt();
        double suma=0;

        for(int i=1;i<=n;i++){
            int a =ThreadLocalRandom.current().nextInt(-9,44);
            if(a % 2 == 0) {
                System.out.println("a = "+a);
                suma += a;
            }
        }
        System.out.println("Suma wylosowanych parzystych liczb wynosi "+suma);

    }

    public static void zad5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Program sluzy do sprawdzania czy podane slowo jest palindronem.");

        System.out.println("Podaj słowo które zostanie sprawdzone:");
        String slowo = scan.next();

        StringBuilder odwrotne = new StringBuilder(slowo);
        odwrotne.reverse();

        String odwr = odwrotne.toString();


        System.out.println("Podane słowo: "+slowo);
        System.out.println("Odwrotność słowa: "+odwr);
        if(odwr.equalsIgnoreCase(slowo))
        {
            System.out.println("Wyraz jest palindronem");
        }
        else {
            System.out.println("Wyraz nie jest palindronem");
        }

    }

}
