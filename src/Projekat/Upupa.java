package Projekat;

public class Upupa {
	
	private String naziv = "Upupa";
	private double cena = 1400;
	
	public Upupa() {
		super();
	}

	public Upupa(String naziv, double cena) {
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
		return "\n--> Vrsta vina: Belo \n\n--> Naziv vina: UPUPA \n\n--> Sorte: \n 100% Tamjanika (Muscat Blanc a Petit Grains) \n\n--> Vinifikacija: \n Fermentacija u tenkovima od nerdjajuceg"
				+ " celika na temperaturi do 14°C, u kontaktu sa \n talogom 9 meseci. \n\n--> Boja: \n Limun zelena sa nagovestajima bledozute - boje slame."
				+ "\n\n--> Aroma: \n Mesavina zutog voca, bilja i belih cvetova. \n\n--> Ukus: \n Nadrazljiva kiselos, koju prati mekan ukus zrelog voca, "
				+ " a onda se zatvara ukusom \n kamilice i cvetova akacije.\n";
	}
	
	

}
