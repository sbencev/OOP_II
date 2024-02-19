package mapEsSetFeladat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FoprogramLottoSorsolas {

	public static void main(String[] args) {

		Set<Integer> tippek1 = new HashSet<Integer>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(8);
				add(29);
				add(45);
				add(73);
				add(79);
			}
		};

		Set<Integer> tippek2 = new HashSet<Integer>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(82);
				add(42);
				add(45);
				add(64);
				add(23);
			}
		};

		Set<Integer> tippek3 = new HashSet<Integer>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(86);
				add(33);
				add(23);
				add(65);
				add(83);
			}
		};

		Map<Set<Integer>, Integer> szelvenyek = new HashMap<Set<Integer>, Integer>();
		szelvenyek.put(tippek1, 0);
		szelvenyek.put(tippek2, 0);
		szelvenyek.put(tippek3, 0);

		LottoSorsolas lottoObj = new LottoSorsolas();
		lottoObj.hetiNyeroszamok();
		System.out.println();
		lottoObj.szelvenyEllenorzes(szelvenyek);

	}

}
