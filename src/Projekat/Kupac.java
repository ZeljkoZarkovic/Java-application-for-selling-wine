package Projekat;

public class Kupac {
	
	private String ime;
	private String prezime;
	private String adresa;
	private String brTel;
	
	public Kupac() {
		super();
	}

	public Kupac(String ime, String prezime, String adresa, String brTel) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.brTel = brTel;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getBrTel() {
		return brTel;
	}

	public void setBrTel(String brTel) {
		this.brTel = brTel;
	}
	
	
	

}
