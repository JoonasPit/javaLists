import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
// Uses Henkilo.java
// Henkilo henkilo = null;
// olioexisist = false
// if olio = true
// tapahtuu

public class HenkilolistaSovellus {
	Henkilo person = new Henkilo();
	Scanner input = new Scanner(System.in);
	List <Henkilo> personList = new ArrayList<Henkilo>();
	// Käytä set ja toString tulostukseen
	// set listresult = nimi jne ja tulosta tulos with tostring
	

	private void addPerson() {
		
		String persName,persAdd;
		double persHeight = 0;
		int persWeight = 0;
		
		System.out.print("Anna nimi: ");
		persName = input.nextLine();
		person.setNimi(persName);
		System.out.print("Anna osoite: ");
		persAdd = input.nextLine();
		System.out.print("Anna pituus: ");
		persHeight = input.nextDouble();
		System.out.print("Anna paino: ");
		persWeight = input.nextInt();
		personList.add(person);
		
	}
	
	private void showAll() {
		// prints all to screen
	}
	private void showPersoninfo() {
		// lists person information by name with BMI done
	}
	
	private void changepersNamAdd() {
		// changes person name and addree, doesn't change height or weight
	}
	
	private void changeHeightWe() {
		// change person height and weight search by name!!
	}
	
	
	

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HenkilolistaSovellus dude = new HenkilolistaSovellus();
		
		
		boolean loop = true;
		
		while (loop == true) {
			int userinput = 0 ;
			System.out.println("1. Lisää henkilö\n2. Näytä henkilön tiedot\n3. Muuta henkilön nimi ja osoite\n4. Muuta henkilön koko\n"
					+ "5. Näytä kaikki henkilöt");
			System.out.print("Anna valintai (0-5): ");
			userinput = input.nextInt();
			
			switch (userinput) {
			case 1:
				dude.addPerson();
				break;
			case 2:
				dude.showPersoninfo();
				break;
			case 3:
				dude.changepersNamAdd();
					
				break;
			case 4:
				dude.changeHeightWe();
				break;
			case 5:
				dude.showAll();
				break;
			case 0:
				loop = false;
				break;
			default:
				System.out.println("Virheellinen valinta");
			}

	}

}
}
