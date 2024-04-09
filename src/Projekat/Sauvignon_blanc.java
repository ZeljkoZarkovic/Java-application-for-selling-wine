package Projekat;

public class Sauvignon_blanc {
	
	private String naziv = "Sauvignon blanc";
	private double cena = 120;
	
	public Sauvignon_blanc() {
		super();
	}
	
	public Sauvignon_blanc(String naziv, double cena) {
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
