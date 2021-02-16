package no.hvl.dat109.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "oblig2", name = "utleiekontor")
public class Utleiekontor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int kontornummer; 
	@Embedded
	private Adresse adresse; 
	private int telefon;
	
	@ManyToOne
	@JoinColumn(name ="bilutleiefirmaNavn", referencedColumnName = "navn")
	private Bilutleiefirma bilutleiefirma;
	
	public Utleiekontor() {}
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
