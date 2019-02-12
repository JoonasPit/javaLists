public class Henkilo {
	
	private String nimi;
	private String osoite;
	
	public Henkilo() {
		// sets both name and address to null
		nimi = "";
		osoite = "";
	}
	public Henkilo(String nimi, String osoite) {
		// sets name and address to given values
		this.nimi = nimi;
		this.osoite = osoite;
	}
	
	public void setOsoite(String osoite){
		//sets the address to given value
		this.osoite = osoite;
	}
	public void setNimi(String nimi) {
		// sets name to given value
		this.nimi = nimi;
	}
	public String getOsoite() {
		// returns address value
		return osoite;
	}
	public String getNimi() {
		// returns name value
		return nimi;
	}
	public String toString() {
		// Prints full input as one string
		return "nimi =" + nimi + "osoite=" + osoite;
	}

}
