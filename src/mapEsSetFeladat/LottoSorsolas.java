package mapEsSetFeladat;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoSorsolas {

	private static Random r = new Random();
	private Set<Integer> nyeroszamok;

	public void hetiNyeroszamok() {

		nyeroszamok = new TreeSet<Integer>();

		do {

			nyeroszamok.add(r.nextInt(90) + 1);

		} while (nyeroszamok.size() < 5);

		System.out.println("A kisorsolt nyeroszamok: ");
		for (Integer item : nyeroszamok) {
			System.out.print(item + "  ");
		}

	}

	public void szelvenyEllenorzes(Map<Set<Integer>, Integer> szelvenyek) {

		int talalat;

		Iterator<Set<Integer>> itr = szelvenyek.keySet().iterator();
		while (itr.hasNext()) {
			Set<Integer> aktualisSzelvenyTippjei = itr.next();

			Set<Integer> masolat = new HashSet<Integer>();
			masolat.addAll(aktualisSzelvenyTippjei);

			masolat.retainAll(nyeroszamok);
			talalat = masolat.size();

			if (talalat > 0) {
				szelvenyek.replace(aktualisSzelvenyTippjei, talalat);
			}
		}

		int i = 1;
		for (Map.Entry<Set<Integer>, Integer> szelveny : szelvenyek.entrySet()) {
			System.out.println(i + ". szelveny tippjei: " + szelveny.getKey() + "talalat: " + szelveny.getValue());
			i++;
		}

	}

}
