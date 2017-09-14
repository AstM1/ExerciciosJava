package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;
import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {
	private ExerciciosString exercicios = new ExerciciosString();

	@Test
	public void letrasMaiusculasTest() {
		Assert.assertEquals("FUSCA", exercicios.letrasMaiusculas("fusca"));
	}

	@Test
	public void letrasMinusculasTest() {
		Assert.assertTrue("fusca".equals(exercicios.letrasMinusculas("FUSCA")));
	}
	
	@Test
	public void quantidadeLetras(){
		Assert.assertTrue(8 == exercicios.quantidadeLetras("DB1START"));
	}
	@Test
	public void quantidadeLetrasEspaco(){
		Assert.assertTrue(8 == exercicios.quantidadeLetrasEspaco("DB1START"));
	}
	@Test
	public void exercicio5(){
		Assert.assertTrue("DB1START".equals(exercicios.exercicio5(" DB1START ")));
	}
	@Test
	public void somente4Primeiras(){
		Assert.assertTrue("GUST".equals(exercicios.somente4Primeiras("GUSTAVO")));
	}
	@Test
	public void aPartirDa3(){
		Assert.assertEquals("STAVO",exercicios.aPartirDa3("GUSTAVO"));
		}
	@Test
	public void quatroUltimas(){
		Assert.assertEquals("TAVO",exercicios.quatroUltimas("GUSTAVO"));
		}
	@Test
	public void substituirPorAluno(){
		Assert.assertTrue("Aluno Ast".equals(exercicios.substituirPorAluno("Gustavo Ast")));
	}
	@Test
	public void quantidadeVogais(){
		Assert.assertTrue(4 == exercicios.quantidadeVogais("abacaxi"));
	}
	public void textoInvertido(){
		Assert.assertTrue("JAVA"== exercicios.textoInvertido("AVAJ"));
	}
}
