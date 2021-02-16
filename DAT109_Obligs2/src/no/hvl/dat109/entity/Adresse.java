package no.hvl.dat109.entity;

public class Adresse {

	private String gatenavn;
	private String husnr;
	private int postnr;
	private String sted;

	public Adresse(String gatenavn, String husnr, int postnr, String sted) {
		this.gatenavn = gatenavn;
		this.husnr = husnr;
		this.postnr = postnr;
		this.sted = sted;
	}

	public String getGatenavn() {
		return gatenavn;
	}

	public void setGatenavn(String gatenavn) {
		this.gatenavn = gatenavn;
	}

	public String getHusnr() {
		return husnr;
	}

	public void setHusnr(String husnr) {
		this.husnr = husnr;
	}

	public int getPostnr() {
		return postnr;
	}

	public void setPostnr(int postnr) {
		this.postnr = postnr;
	}

	public String getSted() {
		return sted;
	}

	public void setSted(String sted) {
		this.sted = sted;
	}

}
