package no.hvl.dat109.utils;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import no.hvl.dat109.entity.*;

@Stateless
public class dbDAO {

	@PersistenceContext(name = "brukerPU")
	private EntityManager em;

	public void lagreNyBil(Bil nyBil) {
		em.persist(nyBil);
	}

	public List<Bil> hentAlleBiler() {
		return em.createQuery("SELECT b FROM bil b", Bil.class).getResultList();
	}

}
