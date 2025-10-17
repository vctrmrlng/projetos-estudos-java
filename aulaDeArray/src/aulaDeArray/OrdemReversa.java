package aulaDeArray;

import java.util.Arrays;

public class OrdemReversa {

	public static void main(String[] args) {
		int[]valores = {2,4,6,8,10,12,14,16,18,20};
		int[]valoresReverso = new int[10];
		for (int i=9; i>=0; i--) {
			System.out.println(valores[i]);
			int casa=9-i;
			valoresReverso[casa] = valores[i];
						
		}
		System.out.println("valoresReversos =" + Arrays.toString(valoresReverso));
	}
	}
