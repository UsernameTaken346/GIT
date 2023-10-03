import java.util.Random;
import java.util.Scanner;

public class lucky7 {
	
    private static int pelaajanRahat = 5; // alkuraha 5 €
    private static final int PELIN_HINTA = 1; // Yhden pelin hinta = 1 €
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (pelaajanRahat >= PELIN_HINTA) {
            pelaaPeli();
            System.out.print("Haluatko pelata uudelleen? (kyllä/ei): ");
            String vastaus = scanner.nextLine().toLowerCase();
            if (!vastaus.equals("kyllä")) {
                break;
            }
        }

        System.out.println("Rahasi ovat loppuneet tai päätit lopettaa. Peli päättyi.");
        scanner.close();
    }

    public static void pelaaPeli() {
    	
        Random random = new Random();

        pelaajanRahat -= PELIN_HINTA;

        int numero1 = random.nextInt(10) + 1;
        int numero2 = random.nextInt(10) + 1;
        int numero3 = random.nextInt(10) + 1;

        System.out.println("Arvotut numerot: " + numero1 + ", " + numero2 + ", " + numero3);

        int NumeroSeitsemanMaara = 0;
        if (numero1 == 7) NumeroSeitsemanMaara++;
        if (numero2 == 7) NumeroSeitsemanMaara++;
        if (numero3 == 7) NumeroSeitsemanMaara++;
        
        if (NumeroSeitsemanMaara == 3) {
            pelaajanRahat += 20;
            System.out.println("Onneksi olkoon, voitit! Kaikki numerot olivat 7. Voitit 20 €.");
            
		} 
        
        else if (NumeroSeitsemanMaara == 2) {
            pelaajanRahat += 5;
            System.out.println("Onneksi olkoon, voitit! Kaksi numeroa oli 7. Voitit 5 €.");
            
        } 
        
		else if (NumeroSeitsemanMaara == 1) {
            pelaajanRahat += 3;
            System.out.println("Onneksi olkoon, voitit! Yksi numero oli 7. Voitit 3 €.");
        } 
        
        else {
            System.out.println("Hävisit! Yksikään numero ei ollut 7.");
        }

        System.out.println("Sinulla on nyt " + pelaajanRahat + " € rahaa.");
    }
}