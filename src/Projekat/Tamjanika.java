package Projekat;

public class Tamjanika {
	
	private String naziv  = "Tamjanika";
	private double cena = 92;
	public Tamjanika() {
		super();
	}
	public Tamjanika(String naziv, double cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	@Override
	public String toString() {
		return "\nNaziv sorte: " + naziv + "\n Cena sorta: " + cena;
	}
	
	

}
