package Zadania.Zadanie4;

import java.util.Scanner;

public class Zadanie4 {
    Scanner scan = new Scanner(System.in);
    public void zadanie4() {

        TabStudent[] tablica = new TabStudent[100];
        for(int i=0;i< tablica.length;i++){
            tablica[i]=new TabStudent("","","",0,0);

        }
        System.out.println("Podaj index:\n");
        int n = scan.nextInt();
        tablica[n].setImie();
        tablica[n].setNazwisko();
        tablica[n].setNazwaSpec();
        tablica[n].setNrInd();
        tablica[n].setRokStud();
        for(TabStudent item : tablica){
            System.out.println(item);
        }
        tablica[n].resetStudent();
        System.out.println("podaj zakres wyswietlania");
        int a = scan.nextInt();
        System.out.println("do:");
        int b=scan.nextInt();
        for(int i = a;i<=b;a++){
            System.out.println(tablica[a]);
        }






    }
}