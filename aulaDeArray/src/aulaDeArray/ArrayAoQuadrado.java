package aulaDeArray;

import java.util.Arrays;

public class ArrayAoQuadrado {

	public static void main(String[] args) {
		int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] quadrados = new int[10];
		for (int i=0; i<=9; i++) {
			int quad;
			quad = (int) Math.pow(valores[i],2);
			quadrados[i] = quad;
		}
		System.out.println("quadrados = " + Arrays.toString(quadrados));
		
	}

}
