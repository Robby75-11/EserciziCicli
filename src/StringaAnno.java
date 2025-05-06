public class StringaAnno {

    public static void main(String[] args) {

        // Esempio di utilizzo di stringaPariDispari
        String parola = "ciao";
        if (stringaPariDispari(parola)) {
            System.out.println("La stringa \"" + parola + "\" ha un numero pari di caratteri.");
        } else {
            System.out.println("La stringa \"" + parola + "\" ha un numero dispari di caratteri.");
        }

        // Esempio di utilizzo di annoBisestile
        int anno = 2024;
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

    // Metodo che controlla se l'anno è bisestile
    public static boolean annoBisestile(int anno) {
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }
}

