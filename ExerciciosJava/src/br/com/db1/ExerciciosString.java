package br.com.db1;

import sun.security.util.Length;

public class ExerciciosString {

	public String letrasMaiusculas(String texto) {
		return texto.toUpperCase();
	
	}

	public String letrasMinusculas(String texto) {
		return texto.toLowerCase();
	}

	public Integer quantidadeLetras(String texto) {
		return texto.length();
	}

	public Integer quantidadeLetrasEspaco(String texto) {
		texto = texto.trim();
		return texto.length();
	}
	public String exercicio5(String texto) {
		texto = texto.trim();
		return texto;
	}
	public String somente4Primeiras(String nome){
		nome=nome.substring(0,4);
		return nome;
	}
	public String aPartirDa3(String nome){
		nome=nome.substring(2);
		return nome;
	}
	public String quatroUltimas(String nome){
		nome=nome.substring(3);
		return nome;
	}
	public String substituirPorAluno(String nome){
		nome=nome.replaceFirst(" ", "Aluno");
		return nome;
	}
	public Integer quantidadeVogais(String nome){
	return nome.replaceAll("[^aeiouAEIOU]","").length();
	}
	public String textoInvertido(String texto){
		texto= new StringBuilder(texto).reverse().toString();
		
	return texto;	
	}
}
	

