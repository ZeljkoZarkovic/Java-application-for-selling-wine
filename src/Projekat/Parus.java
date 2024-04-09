package Projekat;

public class Parus {
	
	private String naziv = "Parus";
	private double cena = 1800;
	
	public Parus() {
		super();
	}

	public Parus(String naziv, double cena) {
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
		return "\n--> Vrsta vina: Belo \n\n--> Naziv vina: PARUS \n\n--> Sorte: \n 100% Sauvignon Blanc \n\n--> Vinifikacija: \n Fermentacije u tenkovima od nerdjajuceg celik, u kontaktu sa talogom "
				+ " 9 meseci. \n\n--> Boja: \n Bistra kora limete. \n\n--> Aroma: \n Kivi, limeta, poomelo, marakuja. \n\n--> Ukus: \n Lagan, "
				+ " osvezavajuci, dobar za svaku priliku.\n";
	}
	
	

}
