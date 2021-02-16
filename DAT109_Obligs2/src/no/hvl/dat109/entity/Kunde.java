package no.hvl.dat109.entity;

public class Kunde {

	private Adresse adresse;
	private String fornavn;
	private String etternavn;
	private int telefon;
	private int kredittkortnr;

	public Kunde(Adresse adresse, String fornavn, String etternavn, int telefon, int kredittkortnr) {

		this.adresse = adresse;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.telefon = telefon;
		this.kredittkortnr = kredittkortnr;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	public int getKredittkortnr() {
		return kredittkortnr;
	}

	public void setKredittkortnr(int kredittkortnr) {
		this.kredittkortnr = kredittkortnr;
	}

}
