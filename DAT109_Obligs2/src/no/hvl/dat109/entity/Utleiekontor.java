package no.hvl.dat109.entity;

public class Utleiekontor {
	
	private Adresse adresse; 
	private int kontornummer;  //Gjør denne til serial
	private int telefon;
	
	
	public Utleiekontor(Adresse adresse, int kontornummer, int telefon) {
		this.adresse = adresse;
		this.kontornummer = kontornummer;
		this.telefon = telefon;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public int getKontornummer() {
		return kontornummer;
	}
	public void setKontornummer(int kontornummer) {
		this.kontornummer = kontornummer;
	}
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	} 
	
	//Liste over bilpark 
	
	

}
