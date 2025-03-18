package Lab2;
import java.util.Scanner;

public class Lab2Main {
    public static void RunLab2Main() {
        Scanner scan = new Scanner(System.in);
        int numer;
        do {
            System.out.println("Podaj numer zadania od 1 do 5:");


            while (!scan.hasNextInt()) {
                System.out.println("Wymagana liczba całkowita od 1 do , spróbuj ponownie.");
                scan.next();
            }

            numer = scan.nextInt();
            if (numer < 1 || numer > 5 ) {
                System.out.println("Nie ma takiego zadania.");
            }

        } while (numer < 1 || numer > 5 );

        switch (numer) {
            case 1:
                System.out.println("1.Zadanie:");
                Zadania task1 = new Zadania();
                task1.zad1();
                break;
            case 2:
                System.out.println("2.Zadanie: ");
                Zadania task2 = new Zadania();
                task2.zad2();
                break;
            case 3:
                System.out.println("3.Zadanie:");
                Zadania task3 = new Zadania();
                task3.zad3();
                break;
            case 4:
                System.out.println("4.Zadanie:");
                Zadania task4 = new Zadania();
                task4.zad4();
                break;
            case 5:
                System.out.println("5.Zadanie:");
                Zadania task5 = new Zadania();
                task5.zad5();
                break;
            default:
                System.out.println("Błąd");
                break;

        }
        scan.close();


    }

}