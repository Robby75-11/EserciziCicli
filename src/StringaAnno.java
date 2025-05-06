package Esercizio;

import java.util.Scanner;

public class StringaAnno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un anno");
        int anno = scanner.nextInt();

        System.out.println(annoBisestile(anno));


        // Esempio di utilizzo di stringaPariDispari
        String parola = "ciao";
        if (stringaPariDispari(parola)) {
            System.out.println("La stringa \"" + parola + "\" ha un numero pari di caratteri.");
        } else {
            System.out.println("La stringa \"" + parola + "\" ha un numero dispari di caratteri.");
        }

        // Esempio di utilizzo di annoBisestile

        if (annoBisestile(anno)) {
            System.out.println("L'anno " + anno + " è bisestile.");
        } else {
            System.out.println("L'anno " + anno + " non è bisestile.");
        }
    }

    // Metodo che controlla se la lunghezza della stringa è pari
    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }
    public static boolean annoBisestile(int anno){
        if((anno%4==0 && anno%100!=0) || (anno%100==0 && anno%400==0)){
            return true;//se l'anno è divisibile per 4 e non per 100 oppure se è divisibile per 100 e per 400
        }
        else{
            return false;
        }
    }

}

