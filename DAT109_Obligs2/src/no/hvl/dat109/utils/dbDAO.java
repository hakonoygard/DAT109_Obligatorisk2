package no.hvl.dat109.utils;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import no.hvl.dat109.entity.*;

@Stateless
public class dbDAO {

	@PersistenceContext(name = "utleieselskapPU")
	private EntityManager em;

	public void lagreNyBil(Bil nyBil) {
		em.persist(nyBil);
	}

	public List<Bil> hentAlleBiler() {
		return em.createQuery("SELECT b FROM Bil b", Bil.class).getResultList();
	}
	
	public void lagreNyttKontor(Utleiekontor nyttKontor) {
		em.persist(nyttKontor);
	}
	
	public void lagreKunde(Kunde kunde) {
		em.persist(kunde);
	}
	
	public void lagreReservasjon(Reservasjon reservasjon) {
		em.persist(reservasjon);
	}
	
	public List<Utleiekontor> hentAlleUtleiekontor() {
		return em.createQuery("SELECT k FROM Utleiekontor k", Utleiekontor.class).getResultList();
	}
	
	public Utleiekontor finnUtleiekontorMedId(int id) {
		return em.find(Utleiekontor.class, id); 
	}

	
	
	
	//Hent basert på søkekriterier
	
	//Oppdater status på bil 
	
	//Oppdater adresse på bil 

	
	
	//Opprette kunde
	
	

}
