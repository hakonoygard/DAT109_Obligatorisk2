package no.hvl.dat109.entity;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "oblig2", name = "kunde")
public class Kunde {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 

	@Embedded
	private Adresse adresse;
	private String fornavn;
	private String etternavn;
	private int telefon;
	private int kredittkortnr;
	
	
	@OneToMany(mappedBy = "kunde")
	private List<Reservasjon> reservasjoner; 
	
	public Kunde() {}

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
