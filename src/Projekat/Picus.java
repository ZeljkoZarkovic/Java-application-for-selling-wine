package Projekat;

public class Picus {
	
	private String naziv = "Picus";
	private double cena = 1800;
	
	public Picus() {
		super();
	}

	public Picus(String naziv, double cena) {
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
		return "\n--> Vrsta vina: Belo \n\n--> Naziv vina: PICUS \n\n--> Sorte \n 100% Chardonnay \n\n--> Vinifikacija \n Alkoholna fermentacija u inoksima sa delimicnim odlezavanjem u buradima \n"
				+ " razlicitog uzrasta od francuskog hrasta. \n\n--> Boja: \n  Bistra boja slame. \n\n--> Aroma: \n Cimet, kokos, kora hleba, "
				+ "badem, zuto voce. \n\n--> Ukus: \n Prefinjeni ukus, koji daje osecaj slatkoce zbog odlezavanjima u buradima.\n";
	}
	
	

}
