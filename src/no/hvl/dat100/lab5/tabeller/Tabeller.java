package no.hvl.dat100.lab5.tabeller;


public class Tabeller {

	public static void main (String[]args) {
		
		int []a1 = {1,3,5,7,9};
		int []a2 = {2,4,6,8,10};
		skrivUt(a1);
		System.out.println("");
		System.out.println(tilStreng(a1));
		summer(a1);
		System.out.println("");
		System.out.println(finnesTall(a1,5));
		posisjonTall(a1,4);
		int []kopitab = reverser(a1);
		skrivUt(kopitab);
		System.out.println();
		erSortert(a1);
		int[] nyTab = settSammen(a1,a2);
		skrivUt(nyTab);
		
	}
	
	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			
			System.out.print(tabell[i]+" ");		
		}		
	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String tab = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tabell [4]) {
				tab += tabell[i];
			}
			else {
				tab += (tabell[i] + ", ");
			}
		}
		tab += "]";
		return tab;
	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		System.out.println(sum);
		
		int var = 0;
		int sum2 = 0;
		while (var < tabell.length) {
			sum2 += tabell[var];
			var++;
		}
		System.out.println(sum2);
		
		int[] a2 = {1,2,3,4,5};
		int sum3 = 0;
		for (int i : a2) {
			sum3 += i;
		 }
		
		System.out.print(sum3);
		
		int ingenting = 0;
		return ingenting;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean riktig = false;
		for (int i = 0; i < tabell.length; i++) {
			
			if (tabell[i] == tall) {
				riktig = true;
			}
		}
		return riktig;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int t = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				t = i;
			}
		}
		System.out.println("indeks nr :" + t);
		return t;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] kopitab = new int[tabell.length];
		
		for (int i = 0, j = tabell.length-1; i < tabell.length; i++, j--) {
			kopitab[i] = tabell[j];
		}
		return kopitab;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean tall = true;
		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i-1] <= tabell [i]) {
				i++;
			} else {
				tall = false;
			}
		}
		System.out.println(tall);
		return tall;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyTabLengde = tabell1.length + tabell2.length;
		
		int [] nyTab = new int [nyTabLengde];
		
		for (int i = 0; i < tabell1.length; i++) {
			nyTab[i] = tabell1[i];
		}
		for (int j = 0; j < tabell2.length; j++) {
			nyTab[tabell1.length + j] = tabell2[j];
		}
		return nyTab;
		
	}
}
