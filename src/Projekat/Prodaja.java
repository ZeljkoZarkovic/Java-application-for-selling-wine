package Projekat;

public class Prodaja {
	
	private String vrsta;
	private String naziv;
	private String ukupna;
	
	public Prodaja() {
		super();
	}

	public Prodaja(String vrsta, String naziv, String ukupna) {
		super();
		this.vrsta = vrsta;
		this.naziv = naziv;
		this.ukupna = ukupna;
	}
	
	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public String getUkupna() {
		return ukupna;
	}

	public void setUkupna(String ukupna) {
		this.ukupna = ukupna;
	}

	@Override
	public String toString() {
		return "Vrsta vina: " + vrsta + "\nNaziv vina: " + naziv  + "\nUkupna cena je: " + ukupna;
	}
	
	

}
