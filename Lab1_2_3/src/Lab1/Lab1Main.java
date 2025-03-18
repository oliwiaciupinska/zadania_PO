package Lab1;
import java.util.Scanner;

public class Lab1Main {
    public static void RunLab1Main() {
        Scanner scan = new Scanner(System.in);
        int numer;
        do {
            System.out.println("Podaj numer zadania od 1 do 7:");


            while (!scan.hasNextInt()) {
                System.out.println("Wymagana liczba od 1 do 7.");
                scan.next();
            }

            numer = scan.nextInt();
            if (numer < 1 || numer > 7) {
                System.out.println("Nie ma takiego zadania.");
            }

        } while (numer < 1 || numer > 7);



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
                System.out.println(task3.zad3());
                break;
            case 4:
                System.out.println("4.Zadanie:");
                Zadania task4 = new Zadania();
                System.out.println(task4.zad4());
                break;
            case 5:
                System.out.println("5.Zadanie:");
                Zadania task5 = new Zadania();
                task5.zad5();
                break;
            case 6:
                System.out.println("6.Zadanie:");
                Zadania task6 = new Zadania();
                task6.zad6();
                break;
            case 7:
                System.out.println("7.Zadanie:");
                Zadania task7 = new Zadania();
                System.out.println(task7.zad7());
                break;
            default:
                System.out.println("Nieoczekiwany błąd.");
                break;

        }
        scan.close();

    }

}


