package Projekat;

public class Malbec {
	
	private String naziv  = "Malbec";
	private double cena = 95;
	
	public Malbec() {
		super();
	}
	
	public Malbec(String naziv, double cena) {
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
