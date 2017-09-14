package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

public class ExerciciosDeMatematicaTest {
	private ExerciciosDeMatematicaTest exercicios = new ExerciciosDeMatematicaTest();
	
	@Test
	public void menorValorEntre2(){
		Assert.assertTrue(3== exercicios.menorValorEntre2(2,3));
	}
	@Test
	public void menorValorEntre3(){
		Assert.assertEquals(3, exercicios.menorValorEntre3(1,2,3));
	}
	@Test
	public void mediaDe3(){
		Assert.assertTrue(message, condition);
	}
	@Test
	public void areaDoTriangulo(){
		Assert.assertTrue(message, condition);
	}
}
