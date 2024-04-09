package Projekat;

public class Chardonnay {
	
	private String naziv = "Chardonnay";
	private double cena = 100;
	
	public Chardonnay() {
		super();
	}
	public Chardonnay(String naziv, double cena) {
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
		return "\nNaziv sorte: " + naziv + "\nCena sorte: " + cena;
	}
	
	
	

}
