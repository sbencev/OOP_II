package szotar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adatbekeres {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int menuValasztas() {

		int menupont = 0;

		do {
			try {

				System.out.println("Valasszon egy menupontot: ");
				System.out.println("1. magyar - angol forditas");
				System.out.println("2. angol - magyar forditas");
				System.out.println("3. kilepes");

				menupont = Integer.parseInt(br.readLine());

			} catch (NumberFormatException e) {
				System.err.println("Hibas adatformatum!");
			} catch (IOException e) {
				System.err.println("I/O hiba!");
			}
		} while (menupont < 1 || menupont > 3);

		return menupont;
	}

	public String forditasBeker() {

		System.out.print("Adja meg a forditando szot: ");
		String forditasra = null;
		try {
			forditasra = br.readLine();
		} catch (IOException e) {
			System.err.println("I/O hiba!");
		}

		return forditasra;

	}

}
