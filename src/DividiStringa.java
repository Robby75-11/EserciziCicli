package esercizio ;

import java.util.Scanner;

public class DividiStringa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Prov;

        do {
            System.out.print("Inserisci una stringa (o ':q' per uscire): ");
            Prov = scanner.nextLine();

            if (!Prov.equals(":q")) {
                // Suddivide la stringa e stampa i caratteri separati da virgole
                for (int i = 0; i < Prov.length(); i++) {
                    System.out.print(Prov.charAt(i));
                    if (i < Prov.length() - 1) {
                        System.out.print(",");
                    }
                }
                System.out.println();
            }

        } while (!Prov.equals(":q"));

        System.out.println("Programma terminato.");
        scanner.close();
    }
}
