package Zadania;

public class Osoba {

    private int wiek;
    private String imie,nazwisko;


    public Osoba(){}
    public Osoba(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    public void pokazdane(){
        System.out.println("Dane Osoby:\n Imie: "+imie+" nazwisko: "+nazwisko+" wiek "+wiek);
    }
}
