package Projekat;

public class Viogner {
	
	private String naziv  = "Viogner";
	private double cena = 110;
	
	public Viogner() {
		super();
	}
	
	public Viogner(String naziv, double cena) {
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
