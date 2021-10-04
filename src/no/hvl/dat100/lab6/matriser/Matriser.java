package no.hvl.dat100.lab6.matriser;

public class Matriser {

	public static void main(String[] args) {

		final int[][] matrise = { { 1, 2, 3, 4, 5 },
								  { 1, 2, 3, 4, 5 },
					  			  { 1, 2, 3, 4, 5 },
								  { 1, 2, 3, 4, 5 }
								};
		final int[][] matrise1 = { { 1, 2, 3, 4, 5 },
				  				   { 1, 2, 3, 4, 5 },
				  				   { 1, 2, 3, 4, 5 },
				  				   { 1, 2, 3, 4, 5 }
								};

		skrivUt(matrise);
		tilStreng(matrise);
		skaler(2, matrise);
		erLik(matrise,matrise1);
	}

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String noke = "";
		for (int i = 0; i < matrise.length; i++) {
			
			for (int j = 0; j < matrise[i].length; j++) {
				
				noke += (matrise[i][j] +" ");
				
			}
			
			noke += ("/n");
		}
		System.out.print(noke);
		return noke;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int [][] kopiTab = new int [matrise.length][matrise.length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] * tall + " ");
			}
			System.out.print("\n");
		}
		
		return kopiTab;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		int row1, col1, row2, col2;
		boolean flag = true;
		
		row1 = a.length;
		col1 = a[0].length;
		row2 = b.length;
		col2 = b[0].length;
		
		if (row1 != row2 || col1 != col2) {
			System.out.print("Matrisene er ikkje like");
		} else {
			for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col1; j++){    
                  if(a[i][j] != b[i][j]){    
                      flag = false;    
                      break;    
                  }    
                }    
            } 
			if(flag)    
                System.out.println("Matrisene er like");    
            else    
                System.out.println("Matrisene er ikkje like");    
		}		
		return flag;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
