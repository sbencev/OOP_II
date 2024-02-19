package szotar;

import java.util.Map;

public class Szotar {

	private Map<String, String> szotar = Fajlkezeles.fajlbolOlvasas("szotar.csv", ";");

	public void angolrolMagyarra(String forditandoSzo) {

		if (szotar.containsKey(forditandoSzo)) {
			System.out.println("magyarul: " + szotar.get(forditandoSzo));
		} else {
			System.out.println("Ez a kifejezes nem szerepel a szotarban");
		}

	}

	public void magyarrolAngolra(String forditandoSzo) {

		if (szotar.containsValue(forditandoSzo)) {
			for (Map.Entry<String, String> szo : szotar.entrySet()) {
				if (szo.getValue().equalsIgnoreCase(forditandoSzo)) {
					System.out.println("Angolul: " + szo.getKey());
				}
			}
		} else {
			System.out.println("Ez a kifejezes nem szerepel a szotarban");
		}

	}

}
