package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTest {
	ExerciciosInteger exerciciosInteger = new ExerciciosInteger();

	@Test
	public void somarTest() {
		Assert.assertTrue(exerciciosInteger.soma(2, 3) == 5);
	}

	@Test
	public void subtrairTest() {

		Assert.assertTrue(exerciciosInteger.subtracao(4, 3) == 1);
	}

	@Test
	public void dividirTest() {
		Assert.assertTrue(exerciciosInteger.divisao(4, 2) == 2);
	}

	@Test
	public void multiplicarTest() {
		Assert.assertTrue(exerciciosInteger.multiplicacao(2, 3) == 6);
	}

	@Test
	public void parTest() {
		Assert.assertTrue(exerciciosInteger.par(4) == 0);
	}

	@Test
	public void maiorTest() {
		Assert.assertTrue(exerciciosInteger.maior(2, 3) == 3);
	}

	@Test
	public void imparAteCemTest(){
		Assert.assertArrayEquals(exerciciosInteger.imparAteCem (99),[99]);
	}

}