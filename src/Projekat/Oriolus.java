package Projekat;

public class Oriolus {
	
	private String naziv = "Oriolus";
	private double cena = 1200;
	
	public Oriolus() {
		super();
	}
	
	public Oriolus(String naziv, double cena) {
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
		return "\n--> Vrsta vina: Belo \n\n--> Naziv vina: ORIOLUS \n\n--> Sorte: \n 50% Chardonnay - 30% Solaris - 20% Rajnski Rizling \n\n--> Vinifikacija \n Odvojene fermentacije u tenkovima od nerdjajuceg celika "
				+ "na temperaturi do 21°C, u \n kontaktu sa talogom 3 meseca tokom "
				+ "integracije komponenata kupaze. \n\n--> Boja: \n Boja svetlog limuna sa zelenim kristalima. \n\n--> Aroma: \n Siroki raspon od arome zutog "
				+ "tropskog voca do arome cvetova bagrema. \n\n--> Ukus: \n Siroka paleta ukusa, najbolje za pocetnog ljubitelja vina.\n";
	}
	
	
}
