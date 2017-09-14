package br.com.db1;

import java.util.ArrayList;

public class ExerciciosDeMatemática {
	public Double menorValorEntre2(Double valor1,Double valor2){
		if(valor1>valor2)
		return valor1;
		else return valor2;
	}
	public Double menorValorEntre3(Double valor1,Double valor2, Double valor3){
		ArrayList list = new ArrayList();
		list.add(valor1);
		list.add(valor2);
		list.add(valor3);
		return	(Double) java.util.Collections.min(list);
	}
	public Double mediaDe3(Double valor1, Double valor2, Double valor3){
		return (valor1+valor2+valor3)/3;
	}
	public Double areaDoTriangulo(Double base, Double altura){
		return (base*altura)/2;
	}
}
