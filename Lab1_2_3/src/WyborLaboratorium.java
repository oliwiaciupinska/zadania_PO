import Lab1.Lab1Main;
import Lab2.Lab2Main;
import Lab3.Lab3Main;
import java.util.Scanner;

public class WyborLaboratorium {
    public void WyborLaboratorium() {
    int numer;
    Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Podaj numer Labolatoriow (1, 2, 3 lub 4)");
            while (!scan.hasNextInt()) { //warunek sprawdzajacy poprawnosc podanych danych w tym przypadku czy sa to inty
                System.out.println("Wymagana liczba 1, 2, 3 lub 4.");
                scan.next();
            }
            numer = scan.nextInt();
            if (numer < 1 || numer > 4) {
                System.out.println("Nie ma takiego zadania sprobuj ponownie");
            }
        } while (numer > 0 && numer < 5 );

        switch (numer) {
            case 1:
                System.out.println("Zadania z Labolatoriów 1");
                Lab1Main.RunLab1Main();
                break;
            case 2:
                System.out.println("Zadania z Labolatoriów 2");
                Lab2Main.RunLab2Main();
                break;
            case 3:
                System.out.println("Zadania z Labolatoriów 3");
                Lab3Main.RunLab3Main();
                break;
            case 4:
                System.out.println("Zadania z Labolatoriów 4");
                Lab4Main.RunLab4Main();
                break;
            default:
                System.out.println("Błąd");
                break;


        }
    }
}
