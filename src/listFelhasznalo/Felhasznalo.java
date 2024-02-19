package listFelhasznalo;

public class Felhasznalo {

	private String azonosito;
	private int jogosultsag;
	private String nev;

	public Felhasznalo(String azonosito, int jogosultsag, String nev) {
		this.azonosito = azonosito;
		this.jogosultsag = jogosultsag;
		this.nev = nev;
	}

	public Felhasznalo(String[] csvSor) {

		this.azonosito = csvSor[0];
		this.jogosultsag = Integer.parseInt(csvSor[1]);
		this.nev = csvSor[2];

	}

	public String getAzonosito() {
		return azonosito;
	}

	private String getJogosultsag() {

		if (jogosultsag == 1) {
			return "vendeg";
		} else if (jogosultsag == 2) {
			return "felhasznalo";
		} else {
			return "admin";
		}
	}

	public String getNev() {
		return nev;
	}

	@Override
	public String toString() {
		return azonosito + " " + getJogosultsag() + " " + nev;
	}

}
