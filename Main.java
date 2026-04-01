public class Main {
    public static void main(String[] args) {
        BiuroUbezpieczen biuro = new BiuroUbezpieczen("Secure Future");

        // Tworzymy obiekty
        Polisa p1 = new Polisa("CAR-101", "Anna Nowak", 900.0, 3, 72000.0, true, true);
        Polisa p2 = new Polisa("CAR-102", "Piotr Lis", 840.0, 5, 54000.0, false, false);

        // Dodajemy do biura
        biuro.dodajPolise(p1);
        biuro.dodajPolise(p2);

        // Wyświetlamy raport
        biuro.wypiszRaport();

        // Pokazujemy dodatkowe funkcje
        System.out.println("\n--- DODATKOWE INFORMACJE ---");
        System.out.println("Liczba wszystkich utworzonych polis: " + Polisa.pobierzLiczbeUtworzonychPolis());
        System.out.println("Prognoza odnowienia dla p1: " + p1.obliczSkladkeOdnowieniowa() + " zł");

        // Pokazujemy działanie equals()
        Polisa pTestowa = new Polisa("CAR-101", "Inny Klient", 0, 0, 0, false, false);
        System.out.println("Czy p1 to ta sama polisa co pTestowa? " + p1.equals(pTestowa));
    }
}
