package sajatInterface;

import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class CSVKiiratas implements Closeable {

	private FileWriter fw;

	public CSVKiiratas(String fajlnev) throws IOException {

		this.fw = new FileWriter(fajlnev, Charset.forName("UTF-8"));

	}
	
	public void fajlbaIr(ICSVMentheto csvObjektum) throws IOException {
		
		fw.write(csvObjektum.CSVFormatum(";"));
		
	}

	@Override
	public void close() throws IOException {

		fw.close();

	}
}
