package esercizio ;

import java.util.Scanner;

public class DividiStringa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Inserisci una stringa (o ':q' per uscire): ");
            input = scanner.nextLine();

            if (!input.equals(":q")) {
                // Suddivide la stringa e stampa i caratteri separati da virgole
                for (int i = 0; i < input.length(); i++) {
                    System.out.print(input.charAt(i));
                    if (i < input.length() - 1) {
                        System.out.print(",");
                    }
                }
                System.out.println(); // Vai a capo dopo l'output
            }

        } while (!input.equals(":q"));

        System.out.println("Programma terminato.");
        scanner.close();
    }
}
