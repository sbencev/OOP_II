package felsorolasTipus;

public class FelsorolasFoprogram {

	public static void main(String[] args) {

		Napok nap = Napok.SZERDA;

		System.out.println(nap);

		System.out.println(nap.ordinal());

		switch (nap) {

		case HETFO:
		case KEDD:
			System.out.println("Het eleje van");
			break;
		case SZERDA:
		case CSUTORTOK:
			System.out.println("Het kozepe van");
			break;
		case PENTEK:
		case SZOMBAT:
		case VASARNAP:
			System.out.println("Het vege van");
			break;

		}

		System.out.println(nap.getClass().getSuperclass());

		Napok[] napok = Napok.values();
		for (Napok egynap : napok) {
			System.out.println(egynap.name() + " " + egynap.ordinal());
		}

		Napok2 masiknap = Napok2.VASARNAP;
		System.out.println(masiknap.toString());
		System.out.println(masiknap.name());
		
		System.out.println();

		KedvencNap napObj1 = new KedvencNap("En", Napok2.SZOMBAT);
		System.out.println(napObj1.getKedvencnap());
		System.out.println(napObj1.toString());
		KedvencNap napObj2 = new KedvencNap("Bence", "PENTEK");
		System.out.println(napObj2.getKedvencnap());
		System.out.println(napObj2.toString());
		KedvencNap napObj3 = new KedvencNap("Bence2", "vasarnap");
		System.out.println(napObj3.getKedvencnap());
		System.out.println(napObj3.toString());

	}
}
