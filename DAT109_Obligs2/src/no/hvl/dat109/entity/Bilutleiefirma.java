package no.hvl.dat109.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "oblig2", name = "bilutleiefirma")
public class Bilutleiefirma {

	@Id
	private String navn;
	private int telefon;
	
	@Embedded
	private Adresse adresse;
	
	public Bilutleiefirma() {}

	public Bilutleiefirma(String navn, int telefon, Adresse adresse) {

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
