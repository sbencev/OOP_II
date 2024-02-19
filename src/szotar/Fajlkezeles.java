package szotar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class Fajlkezeles {

	public static Map<String, String> fajlbolOlvasas(String fajlnev, String elvalaszto) {

		Map<String, String> szotar = new HashMap<String, String>();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev), "UTF-8"));
			while (br.ready()) {

				String ujSor = br.readLine();
				String[] csvSor = ujSor.split(elvalaszto);
				szotar.put(csvSor[0], csvSor[1]);
			}
			br.close();
		} catch (UnsupportedEncodingException e) {
			System.err.println("Nem tamogatott karakterkodolas!");
		} catch (FileNotFoundException e) {
			System.err.println("A fajl nem elerheto!");
		} catch (IOException e) {
			System.err.println("I/O hiba!");
		}

		return szotar;

	}

}
