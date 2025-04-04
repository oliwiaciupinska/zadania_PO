package Zadania.Zadanie4;

import java.util.Scanner;

public class TabStudent {
    private String imie,nazwisko,nazwa_spec;
    private int rok_stud,nr_ind;

    Scanner scan = new Scanner(System.in);

    public TabStudent(String imie, String nazwisko, String nazwa_spec, int nr_ind, int rok_stud) {
        this.imie=" ";
        this.nazwisko=" ";
        this.nazwa_spec=" ";
        this.nr_ind=0;
        this.rok_stud=0;
    }

    public TabStudent(String imie, String nazwisko, int nr_ind) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_ind = nr_ind;
    }


    public TabStudent(String nazwa_spec, int rok_stud, int nrInd){this.nazwa_spec=nazwa_spec;this.rok_stud=rok_stud;}
    public void pokdan(){
        System.out.println("Student:\nImie: "+imie+" Nazwisko: "+nazwisko+" Rok studiow: "+rok_stud+" Nazwa specjalizacji: "+nazwa_spec+" numer indeksu: "+nr_ind);
    }
    public void setNazwisko() {
        String nazwisko;
        System.out.println("Podaj nazwisko:");
        nazwisko = scan.nextLine();
        this.nazwisko = nazwisko;
    }

    public void setNazwaSpec() {
        String nazwa_spec;
        System.out.println("Podaj nazwę specjalizacji:");
        nazwa_spec = scan.nextLine();
        this.nazwa_spec = nazwa_spec;
    }

    public void setRokStud() {
        int rok_stud;
        System.out.println("Podaj rok studiów:");
        rok_stud = scan.nextInt();
        this.rok_stud = rok_stud;
    }

    public void setNrInd() {
        int nr_ind;
        System.out.println("Podaj numer indeksu:");
        nr_ind = scan.nextInt();
        this.nr_ind = nr_ind;
    }
    public void setImie() {
        String imie;
        System.out.println("Podaj imie:");
        imie=scan.nextLine();
        this.imie = imie;
    }
    public void resetStudent() {
        this.imie = " ";
        this.nazwisko = " ";
        this.nazwa_spec = " ";
        this.nr_ind = 0;
        this.rok_stud = 0;
    }

}
