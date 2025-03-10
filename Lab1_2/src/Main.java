public class Main {
    public static void main(String[] args){
        System.out.println("Witaj! Program umożliwia wyświetlanie rozwiązań zadań z Laboratoriów z programowania obiektowego.\nWybierz numer laboratorium, a potem numer zadania.");
        System.out.println("Po wybraniu zadania, wyświetlona zostanie jego treść. Program pokaże, czego potrzebuje, a następnie przedstawi wynik zadania lub sam wynik, bez podawania szczegółowych danych.");

        WyborLaboratorium run = new WyborLaboratorium();
        run.WyborLaboratorium();
    }
}
