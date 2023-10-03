import java.util.Random;
import java.util.Scanner;

public class lucky7 {
	
    private static int pelaajanRahat = 5; // alkuraha 5 €
    private static final int PELIN_HINTA = 1; // Yhden pelin hinta = 1 €
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // tarkistetaan pelaajan rahamäärä, haluaako pelata uudelleen / pystyykö
        
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
        
        // vähennetään pelaajan rahoista pelin hinta eli pelaajan rahat x - 1 €

        pelaajanRahat -= PELIN_HINTA;
        
        // arvotaan pelaajalle kolme numeroa randomilla 

        int numero1 = random.nextInt(10) + 1;
        int numero2 = random.nextInt(10) + 1;
        int numero3 = random.nextInt(10) + 1;
        
        // printataan konsoliin arvotut numerot

        System.out.println("Arvotut numerot: " + numero1 + ", " + numero2 + ", " + numero3);

        // laitetaan int sisälle, nimellä "NumeroSeitsemänMäärä" :ksi nolla, jos on yksi numero 7, muuttuu "NumeroSeitsemänMäärä" yhdeksi jne.
        
        int NumeroSeitsemanMaara = 0;
        if (numero1 == 7) NumeroSeitsemanMaara++;
        if (numero2 == 7) NumeroSeitsemanMaara++;
        if (numero3 == 7) NumeroSeitsemanMaara++;
        
        // jos kaikki 3 numeroa on 7, voitit 20 €
        
        if (NumeroSeitsemanMaara == 3) {
            pelaajanRahat += 20;
            System.out.println("Onneksi olkoon, voitit! Kaikki numerot olivat 7. Voitit 20 €.");
            
		} 
        
        // jos kaksi numeroa on 7, voitit 5 €
        
        else if (NumeroSeitsemanMaara == 2) {
            pelaajanRahat += 5;
            System.out.println("Onneksi olkoon, voitit! Kaksi numeroa oli 7. Voitit 5 €.");
            
        } 
        
        // jos yksi numero 7, voitit 3 €
        
		else if (NumeroSeitsemanMaara == 1) {
            pelaajanRahat += 3;
            System.out.println("Onneksi olkoon, voitit! Yksi numero oli 7. Voitit 3 €.");
        } 
        
        // yksikään numero ei ollut 7, hävisit 1 €
        
        else {
            System.out.println("Hävisit! Yksikään numero ei ollut 7.");
        }
        
        // printataan pelaajan rahamäärä

        System.out.println("Sinulla on nyt " + pelaajanRahat + " € rahaa.");
    }
}