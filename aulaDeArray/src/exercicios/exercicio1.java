package exercicios;

import java.util.Arrays;

public class exercicio1 {
	
	public static void main(String[] args) {
		int []valores = {2,3,6,7,10,13,14,17,18,21};
		int []valoresPares = new int[valores.length];
		int casa = 0;
		for (int i=0; i<valores.length; i++) {
			if (valores[i]%2==0) {
				valoresPares[casa] = valores[i];
				casa++;
			}
	}
        int[] pares = Arrays.copyOf(valoresPares, casa);

		System.out.println("Os valores pares são " + Arrays.toString(pares));

}
}