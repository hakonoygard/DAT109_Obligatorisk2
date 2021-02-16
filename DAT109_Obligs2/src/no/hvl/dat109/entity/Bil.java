package no.hvl.dat109.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "oblig2", name = "bil")
public class Bil {
	@Id
	private String regNr; 
	private String merke; 
	private String modell; 
	private String farge; 
	
	private int kmStand; 
	private String status; 
	private String gruppe;
	public Bil() {}
	
	public Bil(String merke, String modell, String farge, String regNr, int kmStand, String status, String gruppe) {
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.regNr = regNr;
		this.kmStand = kmStand;
		this.status = status;
		this.gruppe = gruppe;
	}
	public String getMerke() {
		return merke;
	}
	public void setMerke(String merke) {
		this.merke = merke;
	}
	public String getModell() {
		return modell;
	}
	public void setModell(String modell) {
		this.modell = modell;
	}
	public String getFarge() {
		return farge;
	}
	public void setFarge(String farge) {
		this.farge = farge;
	}
	public String getRegNr() {
		return regNr;
	}
	public void setRegNr(String regNr) {
		this.regNr = regNr;
	}
	public int getKmStand() {
		return kmStand;
	}
	public void setKmStand(int kmStand) {
		this.kmStand = kmStand;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGruppe() {
		return gruppe;
	}
	public void setGruppe(String gruppe) {
		this.gruppe = gruppe;
	} 
	
	
	

}
