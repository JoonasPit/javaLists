import java.util.List;
import java.util.Scanner;
// Uses Henkilo.java

public class HenkilolistaSovellus {
	Henkilo person = new Henkilo();
	Scanner input = new Scanner(System.in);
	List <String> nameList = new ArrayList<String>();
	
	// Käytä set ja toString tulostukseen
	// set listresult = nimi jne ja tulosta tulos with tostring
	

	private void addPerson() {
		String persName,persAdd;
		double persHeight = 0;
		int persWeight = 0;
		
		System.out.print("Anna nimi: ");
		persName = input.nextLine();
		person.setNimi(persName);
		nameList.add(persName);
		System.out.print("Anna osoite: ");
		persAdd = input.nextLine();
	
		System.out.print("Anna pituus: ");
		persHeight = input.nextDouble();
		System.out.print("Anna paino: ");
		persWeight = input.nextInt();
		
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		boolean loop = true;
		
		while (loop == true) {
			int userinput = 0 ;
			System.out.println("1. Lisää henkilö\n2. Näytä henkilön tiedot\n3. Muuta henkilön nimi ja osoite\n4. Muuta henkilön koko\n"
					+ "5. Näytä kaikki henkilöt");
			System.out.print("Anna valintai (0-5): ");
			userinput = input.nextInt();
			
			switch (userinput) {
			case 1:				
				break;
			case 2:				
				break;
			case 3:
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
