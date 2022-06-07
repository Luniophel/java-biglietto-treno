package jana60;

import java.text.DecimalFormat;
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
		DecimalFormat df = new DecimalFormat(".00");
		
		// Applica gli sconti
		if (passengerAge < 18) {
			System.out.println("I passeggeri minorenni hanno diritto al 20% di sconto!");
			ticketPrice = ticketPrice - (ticketPrice * 0.20f);
			System.out.println("Prezzo del biglietto: " + df.format(ticketPrice) + "\u20ac");
		} 
		else if (passengerAge >= 65) {
			System.out.println("I passeggeri over65 hanno diritto al 40% di sconto!");
			ticketPrice = ticketPrice - (ticketPrice * 0.40f);
			System.out.println("Prezzo del biglietto: " + df.format(ticketPrice) + "\u20ac");
		} 
		else {
			System.out.println("Prezzo del biglietto: " + df.format(ticketPrice) + "\u20ac");
		}
		scan.close();
		
	}

}
