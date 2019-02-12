import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

	public class SanalistaSovellus {
		Scanner input = new Scanner(System.in);

		private List<String> sanaLista = new ArrayList<String>();

		private void lisaaSana( ) {
			String addword;
			System.out.print("Anna sana: ");
			addword = input.nextLine();
			sanaLista.add(addword);
			
		}

		private void listaaSanat() {
			for(int i = 0; i < sanaLista.size(); i++) {
				String word = sanaLista.get(i);
				System.out.println(word);
			}

		}

		private void laskeSanat() {
			int amount = 0;
			String calcword;
			System.out.print("Anna sana, minkä esiintymiskerrat lasketaan: ");
			calcword = input.nextLine();
			for(int i = 0; i < sanaLista.size(); i++) {
				String word = sanaLista.get(i);
				if (word.equals(calcword)) {
				amount++;
				}
			}
				System.out.print("Sana " + calcword + " esiintyi " + amount +  " kertaa");
		}
			


		private void poistaSana() {
			String removedWord;
			System.out.print("Anna sana, joka poistetaan: ");
			removedWord = input.nextLine();
			for(int i = 0; i < sanaLista.size(); i++) {
				String word = sanaLista.get(i);
				if(word.equals(removedWord)) {
					sanaLista.remove(removedWord);
				}
				else{
					System.out.print("Sanaa " + removedWord + " ei ollut listassa");
				}
			}
			
			
		}

		public static void main(String[] args) {
			
			SanalistaSovellus ohjelma = new SanalistaSovellus();
			
				int valinta = 0;

				Scanner input = new Scanner(System.in);

				do {
					System.out.println("\n1 = Lisää sana");
					System.out.println("2 = Listaa sanat");
					System.out.println("3 = Laske sanat");
					System.out.println("4 = Poista sanat");
					System.out.println("0 = Lopeta");
					System.out.print("Anna valintasi: ");

					valinta = input.nextInt();

					switch (valinta) {
					case 1:
						
						ohjelma.lisaaSana();
						break;

					case 2:
						ohjelma.listaaSanat();
						break;

					case 3:
						ohjelma.laskeSanat();
						break;

					case 4:
						ohjelma.poistaSana();
						break;
					}
				} while (valinta != 0);
				
				}
			}
	
	


