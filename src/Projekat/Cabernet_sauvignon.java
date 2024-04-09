package Projekat;

public class Cabernet_sauvignon {
	
	private String naziv  = "Cabernet sauvignon";
	private double cena = 150;
	
	public Cabernet_sauvignon() {
		super();
	}
	
	public Cabernet_sauvignon(String naziv, double cena) {
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
