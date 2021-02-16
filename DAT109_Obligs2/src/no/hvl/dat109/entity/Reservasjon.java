package no.hvl.dat109.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservasjon {

	LocalDate utleiedato;
	LocalDate returdato;
	LocalTime utleietid;
	LocalTime returtid;

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
