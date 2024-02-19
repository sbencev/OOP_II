package sajatInterface;

import java.io.IOException;

public class KapcsolatSzolgaltatasFoprogram {

	public static void main(String[] args) {

		Szolgaltatas szolgObj1 = new Szolgaltatas("Adobevallas", 70000);
		Szolgaltatas szolgObj2 = new Szolgaltatas("Cegalapitas", 170000);
		Szolgaltatas szolgObj3 = new Szolgaltatas("Konyveles", 50000);
		Szolgaltatas szolgObj4 = new Szolgaltatas("Berszamfejtes", 30000);

		Kapcsolat kapcsObj1 = new Kapcsolat("Alfa Bt.", "1051 Bp.", "alfabt@gmail.com", "+36205554789",
				new Szolgaltatas[] { szolgObj1, szolgObj3 });

		Kapcsolat kapcsObj2 = new Kapcsolat("Beta Kft.", "5000 Szolnok", "BetaKft@gmail.com", "+36305547789",
				new Szolgaltatas[] { szolgObj3, szolgObj4 });

		Kapcsolat kapcsObj3 = new Kapcsolat("Sigma Kft.", "2225 Ullo", "Chad@gmail.com", "+36206547799",
				new Szolgaltatas[] { szolgObj2, szolgObj3, szolgObj4 });

		Kapcsolat[] kapcsolatok = new Kapcsolat[] { kapcsObj1, kapcsObj2, kapcsObj3 };

		Szolgaltatas[] szolgaltatasok = new Szolgaltatas[] { szolgObj1, szolgObj2, szolgObj3, szolgObj4 };

		/*
		 * 
		 * CSVKiiratas csv = null;
		 * 
		 * try { csv = new CSVKiiratas("kapcsolatokSzolgaltatasok.csv"); for (Kapcsolat
		 * kapcsolat : kapcsolatok) { csv.fajlbaIr(kapcsolat); for (Szolgaltatas
		 * szolgaltatas : kapcsolat.getSzolgaltatasok()) { csv.fajlbaIr(szolgaltatas); }
		 * }
		 * 
		 * } catch (IOException e) {
		 * 
		 * e.printStackTrace(); }finally {
		 * 
		 * if(csv != null) { try{ csv.close(); }catch(IOException e) {
		 * System.err.println("I/O hiba!"); } }
		 * 
		 * }
		 */

		try (CSVKiiratas csv = new CSVKiiratas("KapcsolatokSzolgaltatasok.csv")) {
			for (Kapcsolat kapcsolat : kapcsolatok) {
				csv.fajlbaIr(kapcsolat);
				for (Szolgaltatas szolgaltatas : kapcsolat.getSzolgaltatasok()) {
					csv.fajlbaIr(szolgaltatas);
				}
			}

			System.out.println("Sikeres fajlbairas!");

		} catch (IOException e) {
			System.err.println("I/O hiba!");
		}

		try (CSVKiiratas csv = new CSVKiiratas("Kapcsolat.csv")) {

			for (Kapcsolat kapcsolat : kapcsolatok) {
				csv.fajlbaIr(kapcsolat);
			}
			System.out.println("Sikeres a kapcsolatok kiirasa!");
		} catch (IOException e) {
			System.err.println("I/O hiba!");
		}
		
		try (CSVKiiratas csv = new CSVKiiratas("Szolgaltatasok.csv")){
			for(Szolgaltatas szolgaltatas : szolgaltatasok) {
				csv.fajlbaIr(szolgaltatas);
			}
			System.out.println("Sieres a szolgaltatasok kiirasa!");
		}catch(IOException e) {
			System.err.println("I/O hiba!");
		}
		

	}

}
