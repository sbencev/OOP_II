package felsorolasTipus;

public enum Napok2 {

	HETFO("hetfo"), KEDD("kedd"), SZERDA("szerda"), CSUTORTOK("csutortok"), PENTEK("pentek"), SZOMBAT("szombat"),
	VASARNAP("vasarnap");

	private final String megnevezes;

	private Napok2(String megnevezes) {
		this.megnevezes = megnevezes;

	}

	public String toString() {

		return megnevezes;

	}

	public static Napok2 megnevezesKonvertalo(String megnevezes) {

		for (Napok2 egynap : Napok2.values()) {
			if (egynap.megnevezes.equals(megnevezes) || egynap.name().equals(megnevezes)) {
				return egynap;
			}
		}

		return null;
	}

}
