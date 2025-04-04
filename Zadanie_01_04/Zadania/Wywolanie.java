package Zadania;

import java.util.Scanner;

public class Wywolanie{


    Scanner scan = new Scanner(System.in);
    public void zad1(){
        Osoba osoba1 = new Osoba("Oliwia","Ciupinska",20);
        Osoba osoba2 = new Osoba("Krzysztof", "Marek", 24);
        Osoba osoba3 = new Osoba("Adam","Kowalski",41);
        osoba1.pokazdane();
        osoba2.pokazdane();
        osoba3.pokazdane();
    }

    public void zad2() {
        Student student1 = new Student("Edmund", "Grubianski", "Informatyka", 2, 124153);
        Student student2 = new Student("Bartosz", "Bartnik", 166213);
        Student student3 = new Student("Informatyka", 3, 164321);
        Student student4 = new Student("Mechatronika", 3, 164321);
        student1.pokdan();
        student2.pokdan();
        student3.pokdan();
        student4.pokdan();

    }
    public void zad3(){
        Student student5 = new Student();
        student5.setImie();
        student5.setNazwisko();
        student5.setNazwaSpec();
        student5.setNrInd();
        student5.setRokStud();
        student5.pokdan();
    }
}


