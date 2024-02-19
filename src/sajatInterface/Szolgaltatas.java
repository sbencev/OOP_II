package sajatInterface;

public class Szolgaltatas implements ICSVMentheto {

	private String megnevezes;
	private int ar;

	public Szolgaltatas(String megnevezes, int ar) {
		this.megnevezes = megnevezes;
		this.ar = ar;
	}

	@Override
	public String CSVFormatum(String elvalaszto) {

		return "Szlgaltatas" + elvalaszto + megnevezes + elvalaszto + ar + "\n";

	}

}
