package Projekat;

public class Merula {
	
	private String naziv = "Merula";
	private double cena = 2400;
	
	public Merula() {
		super();
	}

	public Merula(String naziv, double cena) {
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
		return "\n--> Vrsta vina: Crno \n\n--> Naziv vina: MERULA \n\n--> Sorte: \n 35% Cabernet Sauvignon - 30% Merlot - 25% Cabernet Franc - 5% Malbec - 5% Sangiovese \n\n--> Vinifikacija: \n Odvojene"
				+ "fermentacije u tenkovima od nerdjajuceg celika na temperaturi od 28°C, \n odvojeno odlezavanje u trajanju od 18 meseci u jednom "
				+ " polovinom koriscenom i drugom \n polovinom novim barrique od francuskog hrasta, integracija konacnih komponenata \n kupaze u "
				+ " tenkovima od nerdjajuceg celika na temperaturi od 18°C. \n\n--> Boja: \n Umereno intezivna boja rubina sa ljubicastim rubovima "
				+ " i braon kristalima. \n\n--> Aroma: \n Intezivno crveno voce, nagovestaji crne ribizle i mente, pecene kafe i cimeta. \n\n--> Ukus: \n Vino "
				+ " za iskusnog ljubitelja - umeren dug ukus, horizontalna degustacija sa naglaskom \n na korenu jezika, postojan razvitak topline u ustima.\n";
	}
	
	

}
