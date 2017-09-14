package br.com.db1;

public class ExerciciosInteger {

	public Integer soma(Integer valor1, Integer valor2) {

		return valor1 + valor2;

	}

	public Integer subtracao(Integer valor1, Integer valor2) {

		return valor1 - valor2;
	}

	public Integer multiplicacao(Integer valor1, Integer valor2) {

		return valor1 * valor2;
	}

	public Integer divisao(Integer valor1, Integer valor2) {

		return valor1 / valor2;
	}

	public Integer par(Integer x) {
		if (x % 2 == 0) {
			System.out.println("E par");
		}
		return 0;
	}

	public Integer maior(Integer valor1, Integer valor2) {
		if (valor1 < valor2) {
			return valor2;
		} else
			return valor1;
	}

	public Integer[] imparAteCem(Integer x) {
		Integer impares[] = new Integer[50];
		Integer contador = 0;
		for (Integer i = x; i <= 100; i++) {
			if (i % 2 == 1) {
				impares[50] = i;
				contador++;
			}
		}
		return impares;
	}
}