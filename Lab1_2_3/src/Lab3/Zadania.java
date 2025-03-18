package Lab3;
import java.util.*;


public class Zadania {
    protected static Scanner scan = new Scanner(System.in);


    protected  void zad1() {
        System.out.println("Podaj ile elementów ma miec tablica: ");
        int n = scan.nextInt();
        System.out.println("podaj przedzial (a,b)\n a = ");
        int a = scan.nextInt();
        System.out.println("podaj b = ");
        int b = scan.nextInt();

        int[] tab = losowanie(a, b, n);
        if (tab != null) {
            System.out.println("Elementy tablicy: ");
            int suma = 0;
            for (int item : tab) {
                System.out.println(item + " ");
                suma = suma + item;

            }
            System.out.println("suma tablicy= " + suma);
            System.out.println("srednia= " + (suma / tab.length));
        } else System.out.println("Tablica nie moze byc zerowa");


    }

    protected  void zad2() {
        System.out.println("program wypisuje co drugi element zdefiniowanych przez mnie tablic");
        int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tab2 = {5, 3, 6, 3, 4, 6, 7, 8, 24, 24, 13, 13, 11};
        System.out.println("co drugi element 1 tablicy");
        for (int i = 0; i < tab1.length; i += 2) {
            System.out.println("tab[" + i + "] = " + tab1[i]);
        }
        System.out.println("co drugi element 2 tablicy");
        for (int i = 0; i < tab2.length; i += 2) {
            System.out.println("tab[" + i + "] = " + tab2[i]);
        }
    }

    protected void zad3() {
        String[] tab = {"maslo", "melom", "buty", "aneta", "pingwin3"};

        for (String item : tab) {
            System.out.println(item.toUpperCase() + " ");
        }

    }

    protected void zad4() {
        String[] zdanie = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj element " + (i + 1) + " tablicy : ");
            zdanie[i] = scan.next();
        }
        System.out.println("zdanie to: ");

        for (String item : zdanie) {
            System.out.print(item + " ");
        }

        System.out.println("\nOdwrocone zdanie to");
        for (int i = 4; i > -1; i--) {
            StringBuilder sb = new StringBuilder(zdanie[i]);
            System.out.print(sb.reverse() + " ");

        }


    }

    protected void zad5() {
        System.out.println("Program wczytuje 8 liczb, nastepnie sortuje je i wyswietla.");
        int[] tab = new int[8];
        int[] sor = new int[tab.length];
        for (int i = 0; i < 8; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbe:");
            tab[i] = scan.nextInt();
            sor[i] = tab[i];
        }
        Arrays.sort(sor);
        for (int item : sor) {
            System.out.print(item + " ");
        }

    }

    protected  void zad6() {
        int[] tab = new int[5];
        System.out.println("Podaj 5 liczb, z kazdej zostanie policzona silnia.");
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe: ");
            tab[i] = scan.nextInt();
        }
        for(int item:tab){
            if(silnia(item)==0){
                System.out.println("silnia z "+item+" = Brak silni z liczby ujemnej");
            }
            else
            {System.out.print("silnia z "+item+" = "+silnia(item)+" \n");}
        }


    }

    protected  void zad7() {
        String[] tab1 ={"Pralka","Statek","Pilka","Tablica","Imie"};
        String[] tab2 ={"Pralka","Statek","Pilka","Tablica","Imie"};
        if(Arrays.equals(tab1,tab2))
        {
            System.out.print("Tablice są takie same");
        }else{
            System.out.println("Tablice nie są takie same.");
        }
    }

    private static int[] losowanie(int a, int b, int ilosc) {
        if (a > b) {
            System.out.println("Poczatek przedzialu nie moze byc wiekszy od konca");
            return null;
        }
        if (ilosc < 0) {
            System.out.println("ilosc ele do wylosowania nize moze byc <0");
            return null;
        }
        Random rand = new Random();
        int[] val = new int[ilosc];
        for (int i = 0; i < val.length; i++) {
            val[i] = rand.nextInt(b - a + 1) + a;
        }
        return val;
    }

    private static int silnia(int a) {
        int wynik=1;
        if(a<0) {
            wynik=0;
        } else if(a==0) { return wynik;}

        else {
            for (int i = 1; i <= a; i++)
            {
                wynik =wynik*i;
            }
            return wynik;
        }
        return wynik;
    }
}
