package no.hvl.dat109.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "oblig2", name = "bil")
public class Bil {
	private String merke; 
	private String modell; 
	private String farge; 
	private String regNr; 
	private int kmStand; 
	private Status status; 
	private String gruppe;
	
	public Bil(String merke, String modell, String farge, String regNr, int kmStand, Status status, String gruppe) {
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
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getGruppe() {
		return gruppe;
	}
	public void setGruppe(String gruppe) {
		this.gruppe = gruppe;
	} 
	
	
	

}
