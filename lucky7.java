import java.util.Random;

public class lucky7 {
	
    private static int pelaajanRahat = 5; // Alussa pelaajalla on 5 € rahaa
    private static final int PELIN_HINTA = 1; // Pelin hinta on 1 €
    
    public static void main(String[] args) {
        while (pelaajanRahat >= PELIN_HINTA) {
            pelaaPeli();

    public static void arvoNumerotJaTulosta() {
        Random random = new Random();

        int numero1 = random.nextInt(10) + 1;
        int numero2 = random.nextInt(10) + 1;
        int numero3 = random.nextInt(10) + 1;

        System.out.println("Arvotut numerot: " + numero1 + ", " + numero2 + ", " + numero3);

        if (numero1 == 7 || numero2 == 7 || numero3 == 7) {
            System.out.println("Onneksi olkoon, voitit! Ainakin yksi numero oli 7.");
        } else {
            System.out.println("Hävisit! Yksikään numero ei ollut 7.");
        }
    }
}