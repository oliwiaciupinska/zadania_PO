package Lab1;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.sqrt;

public class
Zadania {

    public  void zad1() {
        System.out.print("Program wyswietla wiek i imie.\n");
        double wiek = 20;
        String imie = "Oliwia";
        System.out.printf("Imie: "+imie+"\nWiek: "+wiek);
    }
    public void zad2(){
        System.out.print("Program liczy i wyswietla proste działania na liczbach.\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj 1 liczbe:\n");
        double a = scan.nextDouble();
        System.out.print("Podaj 2 liczbe:\n");
        double b = scan.nextDouble();
        scan.close();

        System.out.printf("a = " + a + "\nb = " + b + "\n");
        System.out.printf("Suma: \n"+ a + " + " + b + " = " +  (a + b) + "\n");
        System.out.printf("Odejmowanie: \n"+ a + " - " + b + " = " + (a - b) + "\n");
        System.out.printf("Mnożenie: \n"+ a + " * " + b + " = " + (a * b) + "\n");
        if (b != 0) {
            System.out.print("Dzielenie: \n"+ a + " : " + b + " = " + (a / b) + "\n");
        } else {
            System.out.print("Nie mozna dzielic przez 0.\n");
        }

    }
    protected   boolean zad3() {

        System.out.print("Program sprawdzajacy czy liczba jest parzysta.\n");
        System.out.print("Podaj liczbe:\n");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        return (a % 2 == 0);

    }
    public  boolean zad4() {
        System.out.print("Program sprawdzajacy czy liczba jest podzielna przez 5 oraz 3 jednoczesnie.\n");
        System.out.print("Podaj liczbe:\n");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        return (a % 3 == 0 && a % 5 ==0);

    }
    public void zad5() {
        System.out.print("Program liczacy 3 potege dowolnej liczby.\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj liczbe:\n");
        double a = scan.nextDouble();
        System.out.printf(a+" do potegi 3 = "+Math.pow(a,3));
    }
    public void zad6() {
        System.out.print("Program liczacy pierwiastek z danej liczby.\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj liczbe:\n");
        double a = scan.nextDouble();
        System.out.print("Pierwiastek z "+ a +" = "+sqrt(a));
    }
    public  boolean zad7() {
        System.out.println("Podaj 2 liczby ktore beda przedziałem, z przedzialu bedzie losowane 3 liczby, sprawdzimy mozlowosci utworzenia z nich trojkota prostokatnego");
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj 1 liczbe:\n");
        double x = scan.nextDouble();
        System.out.print("Podaj 2 liczbe:\n");
        double y = scan.nextDouble();

        if(y>x){
            double a = ThreadLocalRandom.current().nextDouble(x,y);
            double b = ThreadLocalRandom.current().nextDouble(x,y);
            double c = ThreadLocalRandom.current().nextDouble(x,y);
            System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);
            return ((a*a)+(b*b)==(c*c)||(c*c)+(b*b)==(a*a)||(a*a)+(c*c)==(b*b));}
        else if (y<x) {
            double a = ThreadLocalRandom.current().nextDouble(y,x);
            double b = ThreadLocalRandom.current().nextDouble(y,x);
            double c = ThreadLocalRandom.current().nextDouble(y,x);
            System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);
            return ((a*a)+(b*b)==(c*c)||(c*c)+(b*b)==(a*a)||(a*a)+(c*c)==(b*b));}
        else{
            double a = ThreadLocalRandom.current().nextDouble(y,y);
            double b = ThreadLocalRandom.current().nextDouble(y,y);
            double c = ThreadLocalRandom.current().nextDouble(y,y);
            System.out.println("a = "+a+"\nb = "+b+"\nc = "+c);
            return ((a*a)+(b*b)==(c*c)||(c*c)+(b*b)==(a*a)||(a*a)+(c*c)==(b*b));
        }
    }
}



