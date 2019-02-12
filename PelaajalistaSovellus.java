import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PelaajalistaSovellus {
		List<Integer> numberList = new ArrayList<Integer>();
		List<String> nameList = new ArrayList<String>();
		List<String> positionList = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		Pelaaja player = new Pelaaja();
	
	private void addPlayer() {

		int playerNr;
		String playerName;
		String playerPos;
		
		System.out.print("Anna pelinumero: ");
		playerNr = input.nextInt();
		numberList.add(playerNr);
		System.out.print("Anna nimi: ");
		playerName = input.nextLine();
		playerName = input.nextLine();
		nameList.add(playerName);
		System.out.print("Anna pelipaikka: ");
		playerPos = input.nextLine();
		positionList.add(playerPos);
	}
	
	private void infoPlayer() {
		int searchNr = 0;
		int searchwith = 0; 
		System.out.print("Anna pelinumero: ");
		searchNr = input.nextInt();
		for(int i = 0; i < numberList.size(); i++) {
			int lookfor = numberList.get(i);
			if (lookfor == searchNr) {
				searchwith = i;
				System.out.print("Pelinumero: "+ numberList.get(searchwith) + "\nNimi: " + 
						nameList.get(searchwith) + "\nPelipaikka: " + positionList.get(searchwith));
				break;
			}
			else {
				System.out.print("Pelaajia ei ole pelinumerolla " + searchNr);
				break;
			}
		}
	}
	
	
	private void showAll() {
		for(int i = 0; i < numberList.size(); i++) {
			String pelaajanimi = nameList.get(i);
			int plrnr = numberList.get(i);
			String plrpos = positionList.get(i);
			System.out.println("Numero: " + plrnr + "\nNimi " + pelaajanimi + "\nPelipaikka: " + plrpos + "\n");
		}
	}

	public static void main(String[] args) {
		PelaajalistaSovellus sovellus = new PelaajalistaSovellus();

		int valinta = -1;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("\n1. Lisää pelaaja");
			System.out.println("2. Hae pelaaja");
			System.out.println("3. Näytä pelaajat");
			System.out.println("0. Lopetus");

			System.out.print("Anna valintasi (0-3): ");
			valinta = input.nextInt();

			switch (valinta) {
			case 1:
				sovellus.addPlayer();
				break;
			case 2:
				sovellus.infoPlayer();
				break;
			case 3:
				sovellus.showAll();
				break;
			case 0:
				break;
			default:
				System.out.println("Virheellinen valinta");
			}
		} while (valinta != 0);
	}
}
