import java.util.Random;

public class lucky7 {
	
    private static int pelaajanRahat = 5; // alkuraha 5 €
    private static final int PELIN_HINTA = 1; // Yhden pelin hinta = 1 €
    
    public static void main(String[] args) {
        while (pelaajanRahat >= PELIN_HINTA) {
            pelaaPeli();

        }

        System.out.println("Rahasi ovat loppuneet. Peli päättyi.");
    }

    public static void pelaaPeli() {
        Random random = new Random();

        pelaajanRahat -= PELIN_HINTA;

        int numero1 = random.nextInt(10) + 1;
        int numero2 = random.nextInt(10) + 1;
        int numero3 = random.nextInt(10) + 1;

        System.out.println("Arvotut numerot: " + numero1 + ", " + numero2 + ", " + numero3);

        if (numero1 == 7 || numero2 == 7 || numero3 == 7) {
        int NumeroSeitsemanMaara = 0;
        if (numero1 == 7) NumeroSeitsemanMaara++;
        if (numero2 == 7) NumeroSeitsemanMaara++;
        if (numero3 == 7) NumeroSeitsemanMaara++;
    }
}