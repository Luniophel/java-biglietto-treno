package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
	
		// Le mie variabili
		float travelKm;
		float passengerAge;
		float ticketPrice;
		
		// Funzione scanner su scan
		Scanner scan = new Scanner(System.in);
		
		// Prendi l'età del passeggero
		System.out.print("Scrivi l'età del titolare del biglietto: ");
		passengerAge = scan.nextInt();
		
		// Prendi la lunghezza del percorso in Km
		System.out.print("Quanti Kilometri dovrai percorrere nel tuo viaggio?" + "\r\n" + "Totale Kilometri: ");
		travelKm = scan.nextInt();
		
		// Calcola il prezzo del biglietto
		ticketPrice = travelKm * 0.21f;
		System.out.println("Prezzo del biglietto: " + ticketPrice + "\u20ac");
		
		scan.close();
		
	}

}
