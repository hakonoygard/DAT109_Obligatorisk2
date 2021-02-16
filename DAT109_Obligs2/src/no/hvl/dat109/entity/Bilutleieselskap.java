package no.hvl.dat109.entity;

public class Bilutleieselskap {

	private String navn;
	private int telefon;
	private Adresse adresse;

	public Bilutleieselskap(String navn, int telefon, Adresse adresse) {

		this.navn = navn;
		this.telefon = telefon;
		this.adresse = adresse;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
