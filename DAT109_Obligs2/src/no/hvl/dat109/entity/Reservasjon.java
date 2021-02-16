package no.hvl.dat109.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "oblig2", name = "reservasjon")
public class Reservasjon {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private LocalDate utleiedato;
	private LocalDate returdato;
	private LocalTime utleietid;
	private LocalTime returtid;
	
	@ManyToOne
	@JoinColumn(name ="kundeid", referencedColumnName = "id")
	private Kunde kunde;
	
	@ManyToOne
	@JoinColumn(name ="regnr", referencedColumnName = "regnr")
	private Bil bil; 
	
	public Reservasjon() {}

	public Reservasjon(LocalDate utleiedato, LocalDate returdato, LocalTime utleietid, LocalTime returtid) {
		this.utleiedato = utleiedato;
		this.returdato = returdato;
		this.utleietid = utleietid;
		this.returtid = returtid;
	}

	public LocalDate getUtleiedato() {
		return utleiedato;
	}

	public void setUtleiedato(LocalDate utleiedato) {
		this.utleiedato = utleiedato;
	}

	public LocalDate getReturdato() {
		return returdato;
	}

	public void setReturdato(LocalDate returdato) {
		this.returdato = returdato;
	}

	public LocalTime getUtleietid() {
		return utleietid;
	}

	public void setUtleietid(LocalTime utleietid) {
		this.utleietid = utleietid;
	}

	public LocalTime getReturtid() {
		return returtid;
	}

	public void setReturtid(LocalTime returtid) {
		this.returtid = returtid;
	}

}
