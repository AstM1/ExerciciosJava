package br.com.db1;

public class ExerciciosDeDatas {
		
	public Boolean anoBisexto(Integer ano){
		if(ano%4==0 && ano%100!=0){
			return true;
		}
		else return false;
	}
	
	
}
