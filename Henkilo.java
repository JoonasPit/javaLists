package lisääläksyjä;

public class Henkilo {
	
	private String nimi;
	private String osoite;
	private double height;
	private int weight;
	
	public Henkilo() {
		// sets both name and address to null
		nimi = "";
		osoite = "";
		height = 0;
		weight = 0;
	}
	public Henkilo(String nimi, String osoite, double height, int weight) {
		// sets name and address to given values
		this.nimi = nimi;
		this.osoite = osoite;
		this.height = height;
		this.weight = weight;
	}
	
	public void setOsoite(String osoite){
		//sets the address to given value
		this.osoite = osoite;
	}
	public void setNimi(String nimi) {
		// sets name to given value
		this.nimi = nimi;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight (int weight) {
		this.weight = weight;
	}
	public String getOsoite() {
		// returns address value
		return osoite;
	}
	public String getNimi() {
		// returns name value
		return nimi;
	}
	public double getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public String toString() {
		// Prints full input as one string
		return "nimi =" + nimi + "osoite=" + osoite + height + weight;
	}

}
