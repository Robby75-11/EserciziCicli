package esercizio ;

import java.util.Scanner;

public class ContoAllaRovescia {

    public static void main (String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.print("Inserisci un numero intero: ");
        
        int numero = scanner.nextInt();

        // Conto alla rovescia
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
